package org.pdulvp.data.appgen.site.template;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.resources.IFolder;
import org.eclipse.osgi.util.NLS;
import org.pdulvp.data.Schema;
import org.pdulvp.data.appgen.site.SchemaExt;
import org.pdulvp.data.table.DAttribute;
import org.pdulvp.data.table.DFeature;
import org.pdulvp.data.table.DKey;
import org.pdulvp.data.table.DKeyValue;
import org.pdulvp.data.table.DTable;

public class ModelTableTemplater extends FileTemplater<DTable> {

  Schema schema;

  public ModelTableTemplater(Schema schema_p, IFolder folder_p) {
    super(folder_p);
    schema = schema_p;
  }

  @Override
  protected String getFileName(DTable table) {
    return table.getClassName() + "Table.php";
  }

  @SuppressWarnings("unchecked")
  @Override
  public void proceed(DTable table) {

    line("<?php");
    line("namespace {0}\\Table;", schema.getNamespace());
    line();
    line("use Zend\\Db\\TableGateway\\TableGateway;");
    line();
    line("class {0}Table extends \\Application\\Table\\ModelElementTable {", table.getClassName());
    line();
    indent();
    line("protected $tableGateway;");
    line();
    line("protected $serviceManager;");
    line();
    line("public function __construct(TableGateway $tableGateway, $sm) {");
    indent();
    line("$this->tableGateway = $tableGateway;");
    line("$this->serviceManager = $sm;");
    backward();
    line("}");
    line();

    line("public function fetchAll() {");
    indent();
    line("$resultSet = $this->tableGateway->select();");
    line("return $resultSet;");
    backward();
    line("}");
    line();

    line("public function timestamp() {");
    indent();
    line("$select = new \\Zend\\Db\\Sql\\Select();");
    line("$select->from($this->tableGateway->getTable());");
    line("$select->order(array(\"timestamp DESC\"));");
    line("$select->limit(1);");
    line("$rowset = $this->tableGateway->selectWith($select);");
    line("$row = array(\"timestamp\" => $rowset->current()->timestamp);");
    line("return $row;");
    backward();
    line("}");
    line();

    Collection<String> primaryKeys = new ArrayList<String>();
    Collection<String> primaryKeysValues = new ArrayList<String>();

    Collection<String> filteringKeys = new ArrayList<String>();
    Collection<String> filteringKeysValues = new ArrayList<String>();

    Collection<String> orderingKeys = new ArrayList<String>();
    Collection<String> orderingKeysValues = new ArrayList<String>();

    if (table.getPrimaryKey() != null) {
      for (DFeature attribute : table.getPrimaryKey().getFeatures()) {
        primaryKeys.add(NLS.bind("${0}", attribute.getDbName()));
        primaryKeysValues.add(NLS.bind("''{0}'' => ${0}", attribute.getDbName()));
      }
    }

    for (DKeyValue index : table.getOrderingKeys()) {
      orderingKeys.add(NLS.bind("${0}", SchemaExt.getTableVariable(index.getTable())));
      String value = NLS.bind("$this->serviceManager->get(\"{0}\\Table\\{1}Table\")->get(${2})->{3}.\" DESC\"",
    	      new String[] { schema.getNamespace(), index.getTable().getClassName(),
    	    		 SchemaExt.getTableVariable(index.getTable()), index.getFeature().getDbName() });
      orderingKeysValues.add(value);
    }

    for (DKeyValue index : table.getFilteringKeys()) {
      filteringKeys.add(NLS.bind("${0}", SchemaExt.getTableVariable(index.getTable())));
      String value = NLS.bind("$this->serviceManager->get(\"{0}\\Table\\{1}Table\")->get(${2})->{3}",
    	      new String[] { schema.getNamespace(), index.getTable().getClassName(),
    	    		  SchemaExt.getTableVariable(index.getTable()), index.getFeature().getDbName() });
      filteringKeysValues.add(value);
    }

    line("public function get({0}) {", list(primaryKeys));
    indent();
    line("$rowset = $this->tableGateway->select(array({0}));", list(primaryKeysValues));
    line("$row = $rowset->current();");

    if (!primaryKeys.isEmpty()) {
      for (DAttribute key : table.getOwnedAttributes()) {
        if (key.isExternal()) {
          // TODO primaryKeys.iterator().next()
          line("$row->{0}=$this->getExternalAttribute({1},\"{0}\");", key.getDbName(), primaryKeys.iterator().next());
        }
      }

     // for (DReference key : table.getOwnedReferences()) {
        //if (key.isExternal()) {
          // $row->itemsProducts = $this->serviceManager->get('V2\Table\ItemsProductsTable')->getAll($id);
       //   String attribute = key.getDbName(); // JSONBufferExt.getDBTable((ENamedElement) );
       //   String value = NLS.bind("$this->serviceManager->get(\"{0}\\Table\\{1}Table\")->getAll({2})",
       //       new String[] { schema.getNamespace(), ("" + attribute.charAt(0)).toUpperCase() + attribute.substring(1),
       //     	 list(primaryKeys) });
       //   line("$row->{0}={1};", key.getDbName(), value);
       // }
      //}

    }

    line("return $row;");
    backward();
    line("}");
    line();

    // GetByXXX
    for (DKey index : table.getIndexKeys()) {

      Collection<String> indexKeys = new ArrayList<String>();
      Collection<String> indexValues = new ArrayList<String>();
      for (DFeature feature : index.getFeatures()) {
        indexKeys.add(NLS.bind("${0}", feature.getDbName()));
        indexValues.add(NLS.bind("''{0}'' => ${0}", feature.getDbName()));
      }
      //line("public function getAll({0}{1}$page=null) {", list(sourceKeys, orderingKeys),
  	  //      sourceKeys.isEmpty() && orderingKeys.isEmpty() ? "" : ", ");
  	  
      line("public function getBy{0}({1}, $page=null) {", SchemaExt.toUpperFirst(index.getDbName()), list(indexKeys, orderingKeys));
        indent();
	    line("$select = new \\Zend\\Db\\Sql\\Select();");
	    line("$select->from($this->tableGateway->getTable());");

	    lineNotEmpty("$select->where(array({0}));", list(indexValues, filteringKeysValues));
	    lineNotEmpty("$select->order(array({0}));", list(orderingKeysValues));

	    if (table.getPagination() > 0) {
	      line();
	      line("if ($page !== null) {");
	      indent();
	      lineNotEmpty("$select->limit({0});", "" + table.getPagination());
	      lineNotEmpty("$select->offset({0} * $page);", "" + table.getPagination());
	      backward();
	      line("}");
	    }
	
	    line("$rowset = $this->tableGateway->selectWith($select);");
	    line("$result = array();");
	    line("foreach($rowset as $row) {");
	    indent();
	    line("$result[] = $row;");
	    for (DAttribute akey : table.getOwnedAttributes()) {
	      if (akey.isExternal()) {
	        // TODO primaryKeys.iterator().next()
	        line("$row->{0}=$this->getExternalAttribute($row->{1},\"{0}\");", akey.getDbName(), "id"); // primaryKeys.iterator().next()
	      }
	    }
	    backward();
	    line("}");
	    line("return $result;");
	    backward();
	    line("}");
	    line();

	    
	    line("public function countBy{0}({1}) {", SchemaExt.toUpperFirst(index.getDbName()), list(indexKeys));
        indent();
	    line("$select = new \\Zend\\Db\\Sql\\Select();");
	    line("$select->from($this->tableGateway->getTable());");
	    lineNotEmpty("$select->where(array({0}));", list(indexValues));

	    line("$rowset = $this->tableGateway->selectWith($select);");
	    line("return count($rowset);");
	    backward();
	    line("}");
	    line();
    }

    if (table.getPagination() > 0) {
      line("public function getPagination() {");
      indent();
      line("return {0};", "" + table.getPagination());
      backward();
      line("}");
      line();
    }

    /*
    if (!list(sourceKeys).isEmpty()) {
	    line("public function countAll({0}{1}$page=null) {", list(sourceKeys), sourceKeys.isEmpty() ? "" : ", ");
	    indent();
	    line("$select = new \\Zend\\Db\\Sql\\Select();");
	    line("$select->from($this->tableGateway->getTable());");
	    lineNotEmpty("$select->where(array({0}));", list(sourceValues));
	
	    line("$rowset = $this->tableGateway->selectWith($select);");
	    line("return count($rowset);");
	    backward();
	    line("}");
	    line();
    } */
    
    line("public function exists({0}) {", list(primaryKeys));
    indent();
    line("$rowset = $this->tableGateway->select(array({0}));", list(primaryKeysValues));
    line("return count($rowset)>0;");
    backward();
    line("}");
    line();

    line("public function update(\\{0}\\Model\\{1} $item) {", schema.getNamespace(), table.getClassName());
    indent();
    line("$data = $item->toDBArray();");

    for (DFeature attribute : table.getPrimaryKey().getFeatures()) {
      line("${0} = $item->{0};", attribute.getDbName());
    }

    line("if ($this->exists({0})) {", list(primaryKeys));
    indent();
    line("$this->tableGateway->update($data, array({0}));", list(primaryKeysValues));
    backward();
    line("} else {");
    indent();
    for (DFeature attribute : table.getPrimaryKey().getFeatures()) {
      line("$data[\"{0}\"] = $item->{0};", attribute.getDbName());
    }
    line("$this->tableGateway->insert($data);");
    backward();
    line("}");

    if (!primaryKeys.isEmpty()) {
      for (DAttribute akey : table.getOwnedAttributes()) {
        if (akey.isExternal()) {
          // TODO primaryKeys.iterator().next()
          line("$this->setExternalAttribute({1}, \"{0}\",$item->{0});", akey.getDbName(),
              primaryKeys.iterator().next());
        }
      }
    }

    backward();
    line("}");
    line();

    line("public function delete({0}) {", list(primaryKeys));
    indent();
    line("$this->tableGateway->delete(array({0}));", list(primaryKeysValues));
    backward();
    line("}");
    line();
    

    // GetByXXX
    for (DKey index : table.getIndexKeys()) {

      Collection<String> indexKeys = new ArrayList<String>();
      Collection<String> indexValues = new ArrayList<String>();
      for (DFeature feature : index.getFeatures()) {
        indexKeys.add(NLS.bind("${0}", feature.getDbName()));
        indexValues.add(NLS.bind("''{0}'' => ${0}", feature.getDbName()));
      }
      
      line("public function deleteBy{0}({1}) {", SchemaExt.toUpperFirst(index.getDbName()), list(indexKeys));
        indent();
	    line("$this->tableGateway->delete(array({0}));", list(indexValues));
	    backward();
	    line("}");
	    line();
	
    }
     

    // Generate end of file
    backward();
    line("}");
  }
}

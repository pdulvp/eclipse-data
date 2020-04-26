package org.pdulvp.data.appgen.site.template;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.pdulvp.data.Schema;
import org.pdulvp.data.appgen.site.JSONBufferExt;
import org.pdulvp.data.appgen.site.SchemaExt;

public class FactoriesTemplater extends Templater<ENamedElement> {

  IFolder folder;

  Schema schema;

  public FactoriesTemplater(Schema schema_p, IFolder folder_p) {
    folder = folder_p;
    schema = schema_p;
  }

  public Collection<ENamedElement> getElements() {
    Collection<ENamedElement> elements = new ArrayList<ENamedElement>();
    elements.addAll(JSONBufferExt.getTables(schema));
    return elements;
  }

  protected String getModelElementName(ENamedElement clazz) {
    if (clazz instanceof EStructuralFeature) {
      String name = clazz.getEAnnotation("database").getDetails().get("db_table");
      name = SchemaExt.toUpperFirst(name);
      return name;
    }

    return clazz.getName();
  }

  @Override
  public void accept(ENamedElement clazz) {
    IFile file = folder.getFile("factories.php");

    if (file.exists()) {
      try {
        file.delete(true, false, new NullProgressMonitor());
      } catch (CoreException e) {
        e.printStackTrace();
      }
    }
    line("<?php");
    line("use Zend\\Db\\ResultSet\\ResultSet;");
    line("use Zend\\Db\\TableGateway\\TableGateway;");
    line("use Zend\\Db\\Sql\\TableIdentifier;");
    line();
    line("return array(", getModelElementName(clazz));
    indent();
    line("''factories'' => array(");
    line();
    indent();

    for (ENamedElement element : getElements()) {

      line("''{0}\\Table\\{1}Table'' =>  function($sm) {", schema.getNamespace(), getModelElementName(element));
      indent();
      line("$tableGateway = $sm->get(''{0}\\Table\\{1}TableGateway');", schema.getNamespace(), getModelElementName(element));
      line("$table = new {0}\\Table\\{1}Table($tableGateway, $sm);", schema.getNamespace(),
          getModelElementName(element));
      line("return $table;");
      backward();
      line("},");
      line();

      line("''{0}\\Table\\{1}TableGateway'' => function ($sm) {", schema.getNamespace(), getModelElementName(element));
      indent();
      line("$dbAdapter = $sm->get(''Zend\\Db\\Adapter\\Adapter'');");
      line("$resultSetPrototype = new ResultSet();");
      line("$resultSetPrototype->setArrayObjectPrototype(new \\{0}\\Model\\{1}());", schema.getNamespace(),
          getModelElementName(element));
      line("return new TableGateway(new TableIdentifier(''{0}'',''{1}''), $dbAdapter, null, $resultSetPrototype);",
          JSONBufferExt.getDBTable(element), schema.getDbSchema());
      backward();
      line("},");
      line();

    }
    // Generate end of file
    backward();
    line("),");
    backward();
    line(");");

    InputStream stream = new ByteArrayInputStream(buffer.toString().getBytes());
    try {
      file.create(stream, true, new NullProgressMonitor());
    } catch (CoreException e) {
      e.printStackTrace();
    }
  }
}

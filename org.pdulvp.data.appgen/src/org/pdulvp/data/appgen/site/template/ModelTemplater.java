package org.pdulvp.data.appgen.site.template;

import org.eclipse.core.resources.IFolder;
import org.pdulvp.data.Schema;
import org.pdulvp.data.table.DAttribute;
import org.pdulvp.data.table.DReference;
import org.pdulvp.data.table.DTable;

public class ModelTemplater extends FileTemplater<DTable> {

  Schema schema;

  public ModelTemplater(Schema schema_p, IFolder folder_p) {
    super(folder_p);
    schema = schema_p;
  }

  @Override
  protected String getFileName(DTable clazz) {
    return clazz.getClassName() + ".php";
  }

  @Override
  public void proceed(DTable table) {

    line("<?php");
    line("namespace {0}\\Model;", schema.getNamespace());
    line();
    line("class {0} extends \\Application\\Model\\ModelElement {", table.getClassName());
    line();
    indent();

    for (DAttribute feature : table.getOwnedAttributes()) {
      line("public ${0};", feature.getDbName());
    }
    for (DReference feature : table.getOwnedReferences()) {
      line("public ${0};", feature.getDbName());
    }
    line();

    //line("//Fill an object from JSON. Only editable feature should be filled here");
    line("public function fromJSONArray($data) {");
    indent();
    for (DAttribute feature : table.getOwnedAttributes()) {
      if (feature.isEditable() && !feature.isMany()) {
        line("$this->{0} = (isset($data[''{1}''])) ? $data[''{1}''] : null;", feature.getDbName(),
            feature.getJsonName());
      }
    }
    for (DReference feature : table.getOwnedReferences()) {
      if (feature.isEditable() && !feature.isMany()) {
        line("$this->{0} = (isset($data[''{1}''])) ? $data[''{1}''] : null;", feature.getDbName(),
            feature.getJsonName());
      }
    }
    backward();
    line("}");
    line();

    // Generate toArray
    //line("//Fill an object from the database");
    line("public function fromDBArray($data) {");
    indent();
    for (DAttribute feature : table.getOwnedAttributes()) {

      if ("timestamp".equals(feature.getDbName())) {
        line("$this->{0} = (isset($data[''{0}''])) ? date_format(date_create($data[''{0}'']),''YmdHis'') : null;",
            feature.getDbName());

      } else if ("name".equals(feature.getDbName())) {
        line("$this->{0} = ($this->isString($data[''{0}''])) ? $data[''{0}''] : null;", feature.getDbName());

      } else if ("namefrFR".equals(feature.getDbName())) {
        line("$this->{0} = ($this->isString($data[''{0}''])) ? $data[''{0}''] : null;", feature.getDbName());

      } else {
        line("$this->{0} = (isset($data[''{0}''])) ? $data[''{0}''] : null;", feature.getDbName());
      }
    }

    for (DReference feature : table.getOwnedReferences()) {
    	if ("screensIds".equals(feature.getDbName())) {
            line("$this->{0} = ($this->isArray($data[''{0}''])) ? $this->toStringArray($data[''{0}'']) : null;",
                feature.getDbName());
          } else if ("screensNames".equals(feature.getDbName())) {
            line("$this->{0} = ($this->isArray($data[''{0}''])) ? $this->toStringArray($data[''{0}'']) : null;",
                feature.getDbName());

          } else {
        	line("$this->{0} = (isset($data[''{1}''])) ? $data[''{1}''] : null;", feature.getDbName(),
        		feature.getJsonName());
          }
    }
    backward();
    line("}");
    line();

    // Generate toJSONArray
    //line("//Export an object to JSON. Not exportable features should be removed here");
    line("public function toJSONArray() {");
    indent();
    line("$value=array();");
    for (DAttribute feature : table.getOwnedAttributes()) {
      if (feature.isExportJson()) {
        line("if (isset($this->{0})) $value[''{1}''] = $this->{0};", feature.getDbName(), feature.getJsonName());
      }
    }
    for (DReference feature : table.getOwnedReferences()) {
      if (feature.isExportJson()) {
    	  //if (!feature.isExternal()) {
    		 line( "if (isset($this->{0})) $value[''{1}''] = $this->{0};", feature.getDbName(), feature.getJsonName()); 
    	  //} else {
    	  //      line(
    	  //              "if (isset($this->{0})) $value[''{1}''] = array_map(function($o)'{ return $o->toJSONArray(); '}, $this->{0});",
    	  //              feature.getDbName(), feature.getJsonName());
    	  //}
      }
    }
    line("return $value;");
    backward();
    line("}");
    line();

    // Generate toDBArray
    //line("//Export an object to the Database. External features should be removed here");
    line("public function toDBArray() {");
    indent();
    line("$value=array();");
    for (DAttribute feature : table.getOwnedAttributes()) {
      if (feature.isEditable() && !feature.isExternal() && !feature.isMany()) {
        line("if (isset($this->{0})) $value[''{0}''] = $this->{0};", feature.getDbName());
      }
    }
    for (DReference feature : table.getOwnedReferences()) {
      if (feature.isEditable() && !feature.isExternal() && !feature.isMany()) {
         line("if (isset($this->{0})) $value[''{0}''] = $this->{0};", feature.getDbName());
      }
    }
    line("return $value;");
    backward();
    line("}");
    line();

    // Generate end of file
    backward();
    line("}");

  }
}

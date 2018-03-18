package org.pdulvp.data.appgen.site;

import org.eclipse.emf.ecore.EClass;
import org.pdulvp.data.Schema;
import org.pdulvp.data.SchemaClass;
import org.pdulvp.data.table.DTable;

public class SchemaExt {

	public static String getTableVariable(DTable table) {
		String variable = SchemaExt.toLowerFirst(table.getClassName())+SchemaExt.toUpperFirst(table.getPrimaryKey().getFeatures().get(0).getDbName());
		return variable;
	}

	public static String toUpperFirst(String name) {
		String variable = (""+name.charAt(0)).toUpperCase()+name.substring(1);
		return variable;
	}
	public static String toLowerFirst(String name) {
		String variable = (""+name.charAt(0)).toLowerCase()+name.substring(1);
		return variable;
	}

	public static String getClassName(EClass clazz) {
		return toUpperFirst(clazz.getName());
	}

  public static String getRoute(Schema schema) {
    return schema.getNamespace().toLowerCase();
  }
  
  public static DTable getTable(EClass obj, Schema schema) {
    return getSchemaClass(obj, schema).getTable();
  }

  public static SchemaClass getSchemaClass(EClass obj, Schema schema) {

    for (SchemaClass sc : schema.getOwnedClasses()) {
      if (sc.getClazz().equals(obj) || obj.getEAllSuperTypes().contains(sc.getClazz())) {
        return sc;
      }
    }
    
    return null;
  }
}

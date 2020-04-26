package org.pdulvp.data.appgen.site.template;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;

import org.eclipse.osgi.util.NLS;

public class Templater<T> implements Consumer<T> {

  protected StringBuffer buffer = new StringBuffer();
  private String indent = "";

  public Templater() {
  }

  protected void line(String string, String... args) {
    buffer.append(indent);
    buffer.append(NLS.bind(string, args));
    buffer.append("\n");
  }

  protected void indent() {
    indent = indent + "  ";
  }

  protected void line() {
    buffer.append("\n");
  }

  protected void lineNotEmpty(String string, String list) {
    if (!list.isEmpty()) {
      line(string, list);
    }
  }

  protected String list(Collection<String> primaryKeys, String append, String separator) {
    String result = "";
    Iterator<String> it = primaryKeys.iterator();
    while (it.hasNext()) {
      result += it.next();
      result += append;
      if (it.hasNext()) {
        result += separator;
      }
    }
    return result;
  }
  protected String list(String primaryKeys, Collection<String> secondaryKeys) {
	    Collection<String> result = new ArrayList<String>();
	    result.add(primaryKeys);
	    result.addAll(secondaryKeys);
	    return list(result);
	  }
  
  protected String list(String primaryKeys, Collection<String> secondaryKeys,  Collection<String> ter) {
	    Collection<String> result = new ArrayList<String>();
	    result.add(primaryKeys);
	    result.addAll(secondaryKeys);
	    result.addAll(ter);
	    return list(result);
	  }
  protected String list(Collection<String> primaryKeys, Collection<String> secondaryKeys) {
    Collection<String> result = new ArrayList<String>();
    result.addAll(primaryKeys);
    result.addAll(secondaryKeys);
    return list(result);
  }

  protected String list(Collection<String> primaryKeys) {
    Collection<String> result = new ArrayList<String>();
    
    return list(primaryKeys, "");
  }

  protected String list(Collection<String> primaryKeys, String append) {
    return list(primaryKeys, append, ", ");
  }

  protected void backward() {
    indent = indent.substring(2);
  }

	@Override
	public void accept(T t) {
		 
	}
	
}

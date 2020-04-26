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

public class ControllersTemplater extends Templater<ENamedElement> {

  IFolder folder;

  Schema schema;

  public ControllersTemplater(Schema schema_p, IFolder folder_p) {
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
    IFile file = folder.getFile("AbstractTableController.php");

    if (file.exists()) {
      try {
        file.delete(true, false, new NullProgressMonitor());
      } catch (CoreException e) {
        e.printStackTrace();
      }
    }
    line("<?php");
    line("namespace {0}\\Controller;", schema.getNamespace());
    line();
    line("use Application\\Controller\\AbstractRestController;");
    line("use Zend\\View\\Model\\JsonModel;");
    line();
    line("class AbstractTableController extends AbstractRestController {");
    indent();
    line();

    for (ENamedElement element : getElements()) {
      line("private ${0}Table;", getModelElementName(element).toLowerCase());
      line();
    }

    for (ENamedElement element : getElements()) {
      line("public function get{0}Table() {", getModelElementName(element));
      indent();
      line("if (!$this->{0}Table) {", getModelElementName(element).toLowerCase());
      indent();
      line("$sm = $this->getServiceLocator();");
      line("$this->{0}Table = $sm->get(''{1}\\Table\\{2}Table'');", getModelElementName(element).toLowerCase(),
          schema.getNamespace(), getModelElementName(element));
      backward();
      line("}");
      line("return $this->{0}Table;", getModelElementName(element).toLowerCase());
      backward();
      line("}");
      line();
    }

    // Generate end of file
    backward();
    line("};");

    InputStream stream = new ByteArrayInputStream(buffer.toString().getBytes());
    try {
      file.create(stream, true, new NullProgressMonitor());
    } catch (CoreException e) {
      e.printStackTrace();
    }
  }
}

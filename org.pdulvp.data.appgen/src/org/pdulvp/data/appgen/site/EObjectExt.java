package org.pdulvp.data.appgen.site;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.pdulvp.data.AbstractItem;

public class EObjectExt {

	public static String getText(String name) {
	  name = StringEscapeUtils.unescapeHtml4(name);
	  try {
      name = new String(name.getBytes("ISO-8859-1"), "UTF-8");
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
	  return name;
	}

	public static void apply(final Consumer<EObject> closure, Collection<EObject> values, EClass kind, final IProgressMonitor monitor_p) {
		Collection<EObject> list = values.stream().filter(x -> kind.isInstance(x)).collect(Collectors.toList());
		monitor_p.beginTask("Apply operation " + closure.getClass().getSimpleName(), list.size());
		list.stream().forEach(new Consumer<EObject>() {

			@Override
			public void accept(EObject arg0) {
				closure.accept(arg0);
				monitor_p.worked(1);
			}
		});
	}

	public static <T> void apply(final Consumer<T> closure, Collection<T> list, final IProgressMonitor monitor_p) {
		monitor_p.beginTask("Apply operation " + closure.getClass().getSimpleName(), list.size());
		list.stream().forEach(new Consumer<T>() {

			@Override
			public void accept(T arg0) {
				closure.accept(arg0);
				monitor_p.worked(1);
			}
		});
	}

	public static EObject cloneUnitaryElement(EObject object_p) {
		EObject copy = EcoreUtil.create(object_p.eClass());
		((AbstractItem) copy).setId((((AbstractItem) object_p).getId()));
		return copy;
	}

}

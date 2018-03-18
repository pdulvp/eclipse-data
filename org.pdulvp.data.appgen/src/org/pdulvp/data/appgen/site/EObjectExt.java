package org.pdulvp.data.appgen.site;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.IteratorUtils;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.pdulvp.data.AbstractItem;

public class EObjectExt {

	public static Predicate<EObject> filter(final EClass clazz) {
		return new Predicate<EObject>() {

			@Override
			public boolean evaluate(EObject arg0) {
				return clazz.isInstance(arg0);
			}
		};
	}
	
	public static String getText(String name) {
	  name = StringEscapeUtils.unescapeHtml4(name);
	  try {
      name = new String(name.getBytes("ISO-8859-1"), "UTF-8");
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
	  return name;
	}

	public static Collection<EObject> filter(Iterator<EObject> iterator, EClass kind) {
		Collection<EObject> list = CollectionUtils.select(IteratorUtils.toList(iterator), filter(kind));
		return list;
	}

	public static void apply(final Closure<EObject> closure, Iterator<EObject> iterator, EClass kind, final IProgressMonitor monitor_p) {
		Collection<EObject> list = CollectionUtils.select(IteratorUtils.toList(iterator), filter(kind));
		monitor_p.beginTask("Apply operation " + closure.getClass().getSimpleName(), list.size());
		CollectionUtils.forAllDo(list, new Closure<EObject>() {

			@Override
			public void execute(EObject arg0) {
				closure.execute(arg0);
				monitor_p.worked(1);
			}
		});
	}

	public static <T> void apply(final Closure<T> closure, Iterator<T> iterator, final IProgressMonitor monitor_p) {
		Collection<T> list = IteratorUtils.toList(iterator);
		monitor_p.beginTask("Apply operation " + closure.getClass().getSimpleName(), list.size());
		CollectionUtils.forAllDo(list, new Closure<T>() {

			@Override
			public void execute(T arg0) {
				closure.execute(arg0);
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

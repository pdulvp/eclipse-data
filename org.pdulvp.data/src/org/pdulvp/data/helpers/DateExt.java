package org.pdulvp.data.helpers;

import java.util.Date;

public class DateExt {

	public static String getCurrentDate() {
		return getCurrentDate(new Date().getTime());
	}

	public static String getCurrentDate(long i) {
		String date = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date(i));
		return date;
	}
}

package com.lTeams.spider.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static final String DATE_FORMAT = "yyyy-MM-dd";
	public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	public static String convertCurrentDateToString() {
		return convertDateToString(new Date());
	}
	
	public static String convertDateToString(Date date) {
		return convertDateToStringByFormat(date, DATE_FORMAT);
	}
	
	public static String convertCurrentDateTimeToString() {
		return convertDateTimeToString(new Date());
	}
	
	public static String convertDateTimeToString(Date date) {
		return convertDateToStringByFormat(date, DATE_TIME_FORMAT);
	}
	
	public static String convertDateToStringByFormat(Date date, String format) {
		if(null == date) {
			return "";
		}
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return sdf.format(date);
		} catch (Exception e) {}
		return "";
	}

}

package com.wx.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author TomcatBbzzzs
 */
public class DateUtil {
	private static SimpleDateFormat sdf;
	
	static {	
		final String DATE_TYPE="yyyy-MM-dd HH:mm:ss";
		sdf=new SimpleDateFormat(DATE_TYPE);
	}
	
	/**时间转换为字符串形式*/
	public static String dateToString(Date date) {
		return sdf.format(date);
	}
	
	/**字符串转时间
	 * @throws ParseException */
	public static Date stringToDate(String dateTime) {
		Date date=null;
		try {
			date=sdf.parse(dateTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;

	}
	
}

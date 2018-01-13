package com.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GetCurrentDateTime {

	public static String getCurrentDatetime() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// get current date time with Calendar()
		Calendar cal = Calendar.getInstance();
		String StringDate = dateFormat.format(cal.getTime());
		System.out.println("starting date : "+StringDate);
		return StringDate;
	}

	public static void main(String[] args) {
		getCurrentDatetime();
		
		/*long s=System.currentTimeMillis();
		System.out.println(s);*/
	}

}

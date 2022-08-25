package com.corejava.date;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		
			Date date = null;
			try {
				date = new SimpleDateFormat("yyyyMMdd").parse("20101117");
			} catch (Exception e) {
				e.printStackTrace();
			}
			Timestamp timestamp =  new Timestamp(date != null ? date.getTime() : 0);
			System.out.println(timestamp);
		}	

}

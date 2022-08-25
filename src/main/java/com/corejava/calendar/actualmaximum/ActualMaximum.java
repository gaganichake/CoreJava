package com.corejava.calendar.actualmaximum;

import java.util.Calendar;
import java.util.Date;

public class ActualMaximum {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		calendar.set(2008, Calendar.FEBRUARY,1);

		System.out.println("ActualMaximum: "+calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("Maximum: "+calendar.getMaximum(Calendar.DAY_OF_MONTH));
	}

}

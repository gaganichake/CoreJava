package com.corejava.immutable;

import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		ImmutableClass im = ImmutableClass.createNewInstance(100, "test",
				new Date());
		System.out.println(im);
		im.getMutableField().setYear(2000);
		System.out.println(im);
	}
}

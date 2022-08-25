package com.corejava.immutable;

import java.util.Date;

public class Main2 {
	public static void main(String[] args) {
		ImmutableClassWithoutUsingFinal im = ImmutableClassWithoutUsingFinal.createNewInstance(100, "test",
				new Date());
		System.out.println(im);
		im.getMutableField().setDate(2000);
		System.out.println(im);
	}
}

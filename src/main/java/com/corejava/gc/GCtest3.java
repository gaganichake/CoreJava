package com.corejava.gc;

public class GCtest3 {

	GCtest3 g;

	public static void main(String[] args) {

		String str1 = "Garbage collected after use";
		String str2 = "Another String";
		System.out.println(str1);
		//String object referred by str1 is not eligible for GC yet

		str1 = str2;
		/* Now the str1 variable referes to the String object "Another String" and the object "Garbage collected after use" is not referred by any variable and hence is eligible for GC */
	}

}

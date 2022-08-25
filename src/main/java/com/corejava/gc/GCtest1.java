package com.corejava.gc;

public class GCtest1 {

	public static void main(String[] args) {

		String str = "Set the object ref to null";
		//String object referenced by variable str is not eligible for GC yet

		str = null;
		/*String object referenced by variable str becomes eligible for GC */
	}
}

package com.corejava.gc;

public class GCtest5 {

	/**
	 * Garbage collection can be invoked using System.gc() or Runtime.getRuntime().gc().
	 *
	 */
	public static void main(String[] args) {
		
		String str1 = "Set the object ref str1 to null";
		// String object referenced by variable str1 is not eligible for GC yet

		str1 = null;
		// String object referenced by variable str1 becomes eligible for GC
		
		// The method getRuntime() returns a singleton instance of the Runtime class.
		Runtime.getRuntime().gc();
		// The method System.gc() is the conventional and convenient means of invoking this method.
		
		System.out.println("Exit main()");
		
		// Call of finalize() method of exit of the application
		Runtime.getRuntime().runFinalization();
		// The method System.runFinalization() is the conventional and convenient means of invoking this method.
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize() called");
		super.finalize();
	}

}

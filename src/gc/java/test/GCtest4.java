package gc.java.test;

public class GCtest4 {

	/**
	 * Garbage collection can be invoked using System.gc() or Runtime.getRuntime().gc().
	 * @param args
	 */
	public static void main(String[] args) {
		
		String str1 = "Set the object ref str1 to null";
		// String object referenced by variable str1 is not eligible for GC yet

		str1 = null;
		// String object referenced by variable str1 becomes eligible for GC
		
		// The method getRuntime() returns a singleton instance of the Runtime class.
		Runtime.getRuntime().gc();
		// The method System.gc() is the conventional and convenient means of invoking this method.
		
		String str2 = "Set the object ref str2 to null";
		// String object referenced by variable str2 is not eligible for GC yet

		str2 = null;
		// String object referenced by variable str2 becomes eligible for GC
		
		// The call System.gc() is effectively equivalent to the call: Runtime.getRuntime().gc()
		System.gc();
		
		System.out.println("Done");
	}

}

package gc.java.test;

public class GCtest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "Set the object ref to null";
		//String object referenced by variable str is not eligible for GC yet

		str = null;
		/*String object referenced by variable str becomes eligible for GC */
	}

}

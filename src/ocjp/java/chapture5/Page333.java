package ocjp.java.chapture5;

public class Page333 {

	public static void main(String[] args) {
		int y = 5;
		int x = 2;

		if (((x > 3) && (y < 2)) | doStuff()) {
			System.out.println("true");
		}
		
		// leave off one set of parentheses
//		if ((x > 3) && (y < 2) | doStuff()) {
//			System.out.println("true");
//		}
	}

	private static boolean doStuff() {
		return true;
	}
}

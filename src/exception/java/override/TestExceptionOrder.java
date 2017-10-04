package exception.java.override;

public class TestExceptionOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			// Throwing NullPointerException
//			String name = null;
//			name.equals("gagan");

			// Throwing ClassCastException
			Object x = new Integer(0);
			System.out.println((String) x);
			
		} catch (NullPointerException e) {
			System.out.println("Caught NullPointerException");
		} catch (ClassCastException e) {
			System.out.println("Caught ClassCastException");
		} catch (Exception e) {
			System.out.println("Caught Exception");
		}
	}

}

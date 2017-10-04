package string.java.objecteqality;

public class Test7 {
	
	public static void main(String[] args) {
		String s = "Fred";
		String t = s; // Now t and s refer to the same String object
		
		System.out.println("s string = " + s + "; t string = "+ t);
		
		t.toUpperCase(); // Invoke a String method that changes the String
		
		System.out.println("s string = " + s + "; t string = "+ t);
		
		String u = 	t.toUpperCase(); // Invoke a String method that changes the String
		
		System.out.println("s string = " + s + "; t string = "+ t + "; u string = "+ u);
		System.out.println("Hence toUpperCase() returns a new String object.");
		
	}
}

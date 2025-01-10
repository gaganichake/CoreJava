package com.corejava.string;

public class StringTests {

	public static void main(String[] args) {

		compareNew();

		compareTransitions();

		compareAssingments();

	}

	private static void compareAssingments() {
		String x = "Java"; // Assign a value to x
		String y = x; // Now y and x refer to the same String object
		System.out.println("x string = " + x);
		System.out.println("y string = " + y);

		x = x + " Bean"; // Now modify the object using the x reference
		System.out.println("x string = " + x);
		System.out.println("y string = " + y);
	}

	private static void compareTransitions() {
		String message = "HELLO WORLD";

		String result = transition(message);

		if(result == message){
			System.out.println("1 == " + result);
		}

		if(result.equals(message)){
			System.out.println("2 == " + result);
		}
	}

	private static String transition(String message) {
		return message.toLowerCase();
	}

	private static void compareNew() {

		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = "abc";
		String s4 = "a"+"bc";

		System.out.println("s1.equals(s2) = "+s1.equals(s2)); // true
		System.out.println("s1.equals(s3) = "+s1.equals(s3)); // true
		System.out.println("s1.equals(s4) = "+s1.equals(s4)); // true
		System.out.println("(s1 == s2) = "+(s1 == s2)); //false
		System.out.println("(s1 == s3) = "+(s1 == s3)); // true
		System.out.println("(s1 == s4) = "+(s1 == s4)); // true
	}

}

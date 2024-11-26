package com.corejava.string;

public class Test1 {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = new String("abc");
		String s3 = "abc";
		String s4 = "a"+"bc";

		System.out.println("s1.equals(s2) = "+s1.equals(s2));
		System.out.println("s1.equals(s3) = "+s1.equals(s3));
		System.out.println("s1.equals(s4) = "+s1.equals(s4));
		System.out.println("(s1 == s2) = "+(s1 == s2));
		System.out.println("(s1 == s3) = "+(s1 == s3));
		System.out.println("(s1 == s4) = "+(s1 == s4));

		Object ob = null;

		String str =  (String) ob;

		System.out.println("str = " + str);
	}

}

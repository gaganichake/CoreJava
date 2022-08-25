package com.corejava.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * In general with Lambda expression you create and use anonymous methods.
 * You can create any number of anonymous methods, however you can use the method 
 * name of your Functional Interface to call your anonymous methods. see LambdaExpression.java
 * 
 * This means that you only need to know the method name that already have a implementation.
 * 
 * Method references enable you to do this; they are compact, easy-to-read lambda 
 * expressions for methods that already have a name.
 * 
 */
public class MethodReferences {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Tom", "John");
		
		list.forEach(n -> System.out.println(n));
		
		list.forEach(System.out::println); // Using method reference Equivalent to the above
		
		// Another example
		list.sort((String::compareTo));
	}

}

package com.corejava.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpression {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Tom", "John");
		
		// Passing a lambda expression to a method
		list.forEach((n) -> {System.out.println(n);});
		list.forEach((n) -> System.out.println(n)); // {} are optional for single statement. Notice that semicolon is not required. 
		list.forEach(n -> {System.out.println(n);}); // () are optional for single parameter
		list.forEach(n -> System.out.println(n)); // () & {} are optional for single parameter & single statement.  Notice that semicolon is not required.
		
		// The above is equivalent to
		Consumer<String> method = n -> System.out.println(n);
		list.forEach(method);
		
		/*
		 * Assigning a Lambda expression to a Functional Interface
		 * 
		 * If the above is possible than we can also create our own function interface
		 * and assign the expression to a variable
		 */
		MyStringFormatFunction formatUpparCase = (s, quote) -> s.toUpperCase();// Note: return keyword is not required even though the "format" method has a return type.
		
		MyStringFormatFunction formatLowerCase = (s, quote) -> {
			return quote ? "\"" + s.toLowerCase() + "\"" : s.toLowerCase();
			};// Note: When you use {}, you must explicitly use return keyword, if the method has a return type.
		
		//Use a lambda expression in a method
		print(formatUpparCase,"Hello",  false);
		print(formatLowerCase,"Hello",  true);
		
		
	}
	
	public static void print(MyStringFormatFunction formatCase, String s, boolean quote) {
		System.out.println(formatCase.format(s, quote));
	}

}

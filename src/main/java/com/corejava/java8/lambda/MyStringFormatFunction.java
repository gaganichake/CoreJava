package com.corejava.java8.lambda;

@FunctionalInterface
public interface MyStringFormatFunction {

	String format(String s, boolean quote);
	// Note the return type. The implementation method or Lambda expression 
	// must return a String object.
}

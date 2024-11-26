package com.corejava.java8.stream.terminal.shortcircuit;

import java.util.stream.Stream;

/*
 * Short-circuit Terminal Operations:
 * 
 * boolean noneMatch(Predicate<? super T> predicate)
 * 
 * Tests whether no elements of this stream match the provided predicate. 
 * It may return early with false result when any element matches the provided predicate first.
 */
public class NoneMatch {

	public static void main(String[] args) {
		
		// Following example will print 'true' because none of the elements start with 
		// an upper case.
		
		Stream<String> stream = Stream.of("one", "two", "three", "four");
		  boolean match = stream.noneMatch(s -> s.length() > 0 &&
		                             Character.isUpperCase(s.charAt(0)));
		  System.out.println(match);

	}

}

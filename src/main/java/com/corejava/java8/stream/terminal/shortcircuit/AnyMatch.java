package com.corejava.java8.stream.terminal.shortcircuit;

import java.util.stream.Stream;

/*
 * Short-circuit Terminal Operations:
 * 
 * boolean anyMatch(Predicate<? super T> predicate)
 * 
 * Tests whether any elements of this stream match the provided predicate. 
 * This terminal method will return as soon as it finds the match and will not 
 * transverse all the remaining elements to apply the predicate.
 * 
 */
public class AnyMatch {

	public static void main(String[] args) {
		// Following example prints 'true':
		
		Stream<String> stream = Stream.of("one", "two","three", "four");
		
	    boolean match = stream.anyMatch(s -> s.contains("our"));
	    
	    System.out.println(match);

	}

}

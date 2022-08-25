package com.corejava.java8.stream.terminal;

import java.util.stream.Stream;

/*
 * Terminal Operation:
 */
public class Count {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("one", "two","three", "four");
		
	    long count = stream.count();
	    
	    System.out.println(count);
	    
	    //This is equivalent to 
	    
	    stream = Stream.of("one", "two","three", "four");
	    
	    count = stream.mapToLong(e -> 1L).sum();
	    
	    System.out.println(count);

	}
}

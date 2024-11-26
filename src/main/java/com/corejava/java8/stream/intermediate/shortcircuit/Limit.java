package com.corejava.java8.stream.intermediate.shortcircuit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Short-circuit Stateful Intermediate Operations:
 * 
 * Following (limit) is the only one intermediate-short-circuiting method currently defined 
 * in Stream
 * 
 * Stream<T> limit(long maxSize)
 * 
 * Returns a new stream created from this stream, truncated to be no longer than maxSize in length.
 * 
 */
public class Limit {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		System.out.println("Finding even numbers:");
		
		System.out.println("Running without limit");
		
		List<Integer> result = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

		result.forEach(System.out::println);
		
		System.out.println("Running with limit");
		
		result = numbers.stream().filter(i -> i % 2 == 0).limit(2).collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
		/*
		 * Infinite streams and limit() method
		 * 
		 * limit(..) method is typically used, when there's an infinite input, e.g. when 
		 * a stream created with static methods like Stream<T> generate(Supplier<T> s) or 
		 * Stream<T> iterate(T seed, UnaryOperator<T> f) . Calling limit() method produces 
		 * a finite stream as a result.
		 */
		
		Stream<Integer> stream = Stream.iterate(1, i -> i + 1);
		
		System.out.println("Infinite streams and limit() after filter()");
		
	    stream.filter(i -> i % 2 == 0)
        .limit(5)
        .forEach(System.out::println);
		
	    
	    //what if we use the limit(5) first and then apply the filter later? 
//	    System.out.println("Infinite streams and limit() before filter()");
	    
//	    stream.limit(5)
//        .filter(i -> i % 2 == 0)
//        .forEach(System.out::println); // Error: stream has already been operated upon or closed
	    //That shows that order matters while performing intermediate operations.
	}

}

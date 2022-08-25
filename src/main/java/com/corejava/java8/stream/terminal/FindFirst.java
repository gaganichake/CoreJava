package com.corejava.java8.stream.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/*
 * Short-circuit Terminal Operations:
 * 
 * Optional<T> findFirst()
 * 
 * Returns the very first element (wrapped in Optional object) of this 
 * stream and before transversing the other.
 */
public class FindFirst {

	public static void main(String[] args) {
		
		/* 
		 * Following example shows a InStream of predefined elements which 
		 * is meant to return only multiples of 3 results. The terminal operation
		 * terminated on finding the first element, hence short-circuited.
		 */
		
		IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6);
//		IntStream stream = IntStream.of(1, 2, 6, 4, 5, 3);
		
		 OptionalInt opt = stream.filter(i -> i % 3 == 0).findFirst();
		   
		   if (opt.isPresent()) {
		       System.out.println(opt.getAsInt());
		   }
		   
		 /* 
		  * Please note that, in above example IntStream.of creates a sequential 
		  * ordered stream. If source is not initially ordered then we cannot predict 
		  * findFirst will still return '3'
		  * Try IntStream stream = IntStream.of(1, 2, 6, 4, 5, 3);
		  */
		   
		   /*
		    * For parallel ordered streams it's guaranteed that findFirst will return 
		    * the very first element which will correspond to the first original source 
		    * element (regardless it's been mapped to something else). The operation will 
		    * wait for necessary parallel results arrival before short-circuiting.
		    */
	}

}

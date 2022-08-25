package com.corejava.java8.stream.terminal;

import java.util.Arrays;
import java.util.List;

/*
 * Terminal Operation:
 * 
 * forEach: The forEach method is used to iterate through every element of the stream.
 */
public class ForEach {

	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(2,3,4,5);
		
		number.forEach(System.out::print);

		number.stream().map(x->x*x).forEach(System.out::println);
	}

}

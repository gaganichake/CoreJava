package com.corejava.java8.stream.terminal;

import java.util.Arrays;
import java.util.List;

/*
 * Terminal Operation:
 * 
 * reduce: The reduce method is used to reduce the elements of a stream to a single value.
 * The reduce method takes a BinaryOperator as a parameter.
 */
public class Reduce {

	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(2,3,4,5);
		
		int even = number.stream().filter(x->x%2==0).reduce(0, Integer::sum);
		
		System.out.println(even);
	}

}

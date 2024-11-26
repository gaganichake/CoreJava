package com.corejava.java8.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Intermediate Operation:
 * 
 * map: The map method is used to return a stream consisting of the results of applying
 * the given function to the elements of this stream. Simply transformation step.
 */
public class Map {

	
	
	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(2,3,4,5);
		
		List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
		
		square.forEach(System.out::println);

	}

}

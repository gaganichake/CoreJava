package com.corejava.java8.stream.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Terminal Operation:
 * 
 * collect: The collect method is used to return the result of the intermediate 
 * operations performed on the stream.
 */
public class Collect {

	public static void main(String[] args) {
		
		List<Integer> number = Arrays.asList(2,3,4,5,3);
		
		Set<Integer> square = number.stream().map(x->x*x).collect(Collectors.toSet());
		
		square.forEach(System.out::println);

	}

}

package com.corejava.java8.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Stateful Intermediate Operations:
 * 
 * sorted: The sorted method is used to sort the stream.
 */
public class Sorted {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Reflection","Collection","Stream");
		
		List<String> result = names.stream().sorted().collect(Collectors.toList());
		
		result.forEach(System.out::println);
	}

}

	package com.corejava.java8.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Intermediate Operation:
 * 
 * filter: The filter method is used to select elements as per the Predicate passed as argument.
 */
public class Filter {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Reflection","Collection","Stream");
		
		List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());

		result.forEach(System.out::println);
	}

}

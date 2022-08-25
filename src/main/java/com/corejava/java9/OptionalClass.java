package com.corejava.java9;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/*
 * In Java SE 9, the following three methods to improve Optional functionality.
 * 
 * stream()
 * 
 * ifPresentOrElse()
 * 
 * or()
 */
public class OptionalClass {

	public static void main(String[] args) {

		//They have added “stream()” method to work on Optional objects lazily as shown below:
		
		Stream<Optional<Integer>> emp = getEmployee();
		Stream<Integer> empStream = emp.flatMap(Optional::stream);
		
		empStream.forEach(System.out::println);
		
		Optional<Integer> i = Optional.ofNullable(1);
		Optional<Integer> j = Optional.ofNullable(null);
		
		i.ifPresentOrElse(System.out::println, System.out::println);
		j.ifPresentOrElse(System.out::println, System.out::println);
		//j.ifPresentOrElse(System.out::println, () -> System.out.println("No result"));//try this
		
		// This or() method takes a Supplier as an argument to specify a default value
		System.out.println(i.or(() -> Optional.of(0)));
		System.out.println(j.or(() -> Optional.of(0)));
				
	}

	private static Stream<Optional<Integer>> getEmployee() {
		
		List<Optional<Integer>> employees = List.of(Optional.of(1), Optional.of(2), Optional.ofNullable(null));
		
//		List<Optional<Integer>> employees = List.of(Optional.of(1), Optional.of(2), Optional.of(3));
		
//		List<Optional<Integer>> employees = List.of(Optional.ofNullable(null), Optional.ofNullable(null), Optional.ofNullable(null));
		
		return employees.stream();
	}

}

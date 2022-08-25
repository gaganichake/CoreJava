package com.corejava.java8.interfaces;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		
		System.out.println(division(4, 2));
		System.out.println(division(4, 0));
		
		Optional<Integer> i = Optional.ofNullable(1);
		
		System.out.println(i.isPresent());
		
		Optional<Integer> j = Optional.ofNullable(null);
		
		j.ifPresent(System.out::println);// Prints nothing
		
		System.out.println(i.orElse(0));
		System.out.println(j.orElse(0));

	}

	public static Optional<Integer> division(Integer i1, Integer i2) {
		if (i2 == 0)
			return Optional.empty();
		else {
			Integer i3 = i1 / i2;
			return Optional.of(i3);
		}
	}

}

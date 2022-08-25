package com.corejava.java11;

import java.util.List;
import java.util.Optional;

public class OptionalIsEmpty {

	public static void main(String[] args) {

		var numbers = List.of(1, 2, 3, 4, 5, 6, 7);
		Optional<Integer> numbersGreaterThanFour = numbers.stream().filter(number -> number > 4).findFirst();
		
		// isPresent version
		if (numbersGreaterThanFour.isPresent()) {
			System.out.println("The number: " + numbersGreaterThanFour.get());
		} else {
			System.out.println("Number is not available!");
		}
		
		// isEmpty version
		if (numbersGreaterThanFour.isEmpty()) {
			System.out.println("Number is not available!");
		} else {
			System.out.println("The number: " + numbersGreaterThanFour.get());
		}

	}

}

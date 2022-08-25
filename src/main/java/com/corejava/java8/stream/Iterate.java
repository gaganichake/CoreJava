package com.corejava.java8.stream;

import java.util.stream.IntStream;

public class Iterate {

	public static void main(String[] args) {

		// Not working
		IntStream.iterate(1, x -> x+1).filter(x -> x < 20).limit(19).forEach(System.out::println);

		// It is similar to for-loop:
		// First parameter is init value,
		// next parameter is condition and
		// final parameter is to generate next element (for instance, increment or decrement operation).
		for(int x = 1; x < 20; x++) {
			
			System.out.println(x);
		}
	}

}

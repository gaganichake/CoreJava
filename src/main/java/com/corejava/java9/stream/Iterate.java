package com.corejava.java9.stream;

import java.util.stream.IntStream;

public class Iterate {

	public static void main(String[] args) {
		
		// Java SE 9's iterate() = Java SE 8's iterate() + Java SE 8's filter()
		IntStream.iterate(2, x -> x < 20, x -> x+1).forEach(System.out::println);
		
		// It is similar to for-loop: First parameter is init value, next parameter is condition and final parameter is to generate next element (for instance, increment or decrement operation).
		for(int x = 2; x < 20; x++) {
			
			System.out.println(x);
		}
	}

}

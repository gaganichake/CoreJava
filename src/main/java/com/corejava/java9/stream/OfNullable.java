package com.corejava.java9.stream;

import java.util.stream.Stream;

public class OfNullable {

	public static void main(String[] args) {

		Stream.ofNullable(1).forEach(System.out::println);
		
		Stream.ofNullable(null).forEach(System.out::println);
				
				
	}

}

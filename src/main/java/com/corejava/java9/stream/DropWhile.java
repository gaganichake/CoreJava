package com.corejava.java9.stream;

import java.util.stream.Stream;

public class DropWhile {

	public static void main(String[] args) {

		Stream.of(1,2,3,4,5,6,7,8,9,10).dropWhile(i -> i < 5 ).forEach(System.out::println);
	}

}

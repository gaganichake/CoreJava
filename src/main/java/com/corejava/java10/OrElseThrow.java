package com.corejava.java10;

import java.util.Optional;

public class OrElseThrow {

	public static void main(String[] args) {

		Optional<String> name = Optional.empty();
		
		// It is same as name.get() but preferred option then get() method
		System.out.println(name.orElseThrow());
	}

}

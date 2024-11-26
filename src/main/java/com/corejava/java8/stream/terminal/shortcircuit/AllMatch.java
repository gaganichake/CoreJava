package com.corejava.java8.stream.terminal.shortcircuit;

import java.util.stream.Stream;

/*
 * Short-circuit Terminal Operations:
 *
 * boolean allMatch(Predicate<? super T> predicate)
 *
 * Tests whether all elements match the provided predicate. It may return early with
 * false result when any element doesn't match first.
 */
public class AllMatch {

	public static void main(String[] args) {

		//Following examples outputs false because 'Three' doesn't start with a lower case,
		//at that point short-circuiting happens.

		Stream<String> stream = Stream.of("one", "two", "Three", "four");

		boolean match = stream.allMatch(s -> s.length() > 0 &&
	                            Character.isLowerCase(s.charAt(0)));

		System.out.println(match);

	}

}

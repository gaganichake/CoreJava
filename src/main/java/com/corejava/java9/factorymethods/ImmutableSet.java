package com.corejava.java9.factorymethods;

import java.util.Set;

public class ImmutableSet {

	public static void main(String[] args) {

		// Characteristics of a Immutable Set are similar to Immutable List.
		
		// Empty immutable Set
		Set<String> immutableSet = Set.of();

		// Non-Empty Set API Utility
		// static <E> Set<E> of(E e1)
		// static <E> Set<E> of(E e1,E e2)
		// static <E> Set<E> of(E e1,E e2,E e3)
		// static <E> Set<E> of(E e1,E e2,E e3,E e4)
		// static <E> Set<E> of(E e1,E e2,E e3,E e4,E e5)
		// static <E> Set<E> of(E e1,E e2,E e3,E e4,E e5,E e6)
		// static <E> Set<E> of(E e1,E e2,E e3,E e4,E e5,E e6,E e7)
		// static <E> Set<E> of(E e1,E e2,E e3,E e4,E e5,E e6,E e7,E e8)
		// static <E> Set<E> of(E e1,E e2,E e3,E e4,E e5,E e6,E e7,E e8,E e9)
		// static <E> Set<E> of(E e1,E e2,E e3,E e4,E e5,E e6,E e7,E e8,E e9,E e10)

		Set<String> nonemptyImmutableSet = Set.of("one", "two", "three");

		// Immutable Non-Empty Set With Var-Args
		String[] nameArr = { "one", "two", "three" };
		Set<String[]> set = Set.<String[]>of(nameArr);
	}

}

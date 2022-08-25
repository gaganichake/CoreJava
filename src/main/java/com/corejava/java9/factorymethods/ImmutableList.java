package com.corejava.java9.factorymethods;

import java.util.List;
import java.util.Set;

public class ImmutableList {

	public static void main(String[] args) {
		
		List<String> emptyImmutableList = List.of();
		
		// These useful methods are used to create a new Immutable List with one element to 10 elements:
		// static <E> List<E> of(E e1)
		// static <E> List<E> of(E e1,E e2)	
		// static <E> List<E> of(E e1,E e2,E e3)
		// static <E> List<E> of(E e1,E e2,E e3,E e4)
		// static <E> List<E> of(E e1,E e2,E e3,E e4,E e5)	
		// static <E> List<E> of(E e1,E e2,E e3,E e4,E e5,E e6)	
		// static <E> List<E> of(E e1,E e2,E e3,E e4,E e5,E e6,E e7)	
		// static <E> List<E> of(E e1,E e2,E e3,E e4,E e5,E e6,E e7,E e8)	
		// static <E> List<E> of(E e1,E e2,E e3,E e4,E e5,E e6,E e7,E e8,E e9)	
		// static <E> List<E> of(E e1,E e2,E e3,E e4,E e5,E e6,E e7,E e8,E e9,E e10)
		
		List<String> nonEmptyImmutableList = List.of("one","two","three");
		
		// The following is a Var-Args method (Variable Number of arguments method):
		
		String[] nameArr = { "one", "two", "three" };
		List<String[]> nonEmptyImmutableVarArgsList = List.<String[]>of(nameArr);
		
	}

}

package com.corejava.java8.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList {

	public static void main(String[] args) {

		// Immutable Lists are not modifiable (unmodifiable collections).
		// They are Immutable.
		// We cannot add, modify and delete their elements.
		// If we try to perform Add/Delete/Update operations on them, we will get UnsupportedOperationException as shown below:
		// They don’t allow null elements.
		// If we try to create them with null elements, we will get NullPointerException
		// They are serializable if all elements are serializable.
		
		List<String> emptyList = new ArrayList<>();
		
		List<String> emptyImmutableList = Collections.unmodifiableList(emptyList);
		
		List<String> nonemptyImmutableList = new ArrayList<>();
		nonemptyImmutableList.add("one");
		nonemptyImmutableList.add("two");
		nonemptyImmutableList.add("three");
		List<String> nonEmptyImmutableList = Collections.unmodifiableList(nonemptyImmutableList);
		 
		 
//		nonEmptyImmutableList.add("four");// try
		
//		nonEmptyImmutableList.add(null); // try
		
//		List<String> listWithNull = List.of("one","two","three", null); // try
	}

}

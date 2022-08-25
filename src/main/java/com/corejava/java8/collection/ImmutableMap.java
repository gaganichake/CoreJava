package com.corejava.java8.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMap {

	public static void main(String[] args) {

		Map<Integer, String> emptyMap = new HashMap<>();
		Map<Integer, String> immutableEmptyMap = Collections.unmodifiableMap(emptyMap);

		
		Map<Integer,String> nonemptyMap = new HashMap<>();
		 nonemptyMap.put(1,"one");
		 nonemptyMap.put(2,"two");
		 nonemptyMap.put(3,"three");
		 Map<Integer,String> immutableNonEmptyMap = Collections.unmodifiableMap(nonemptyMap);
	}

}

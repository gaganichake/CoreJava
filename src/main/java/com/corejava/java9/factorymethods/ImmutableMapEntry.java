package com.corejava.java9.factorymethods;

import java.util.Map;

public class ImmutableMapEntry {

	public static void main(String[] args) {

		// Characteristics of a Immutable Map are similar to Immutable List. 
		
		// Empty Map API Utility

		 Map<Integer,String> emptyImmutableMap = Map.ofEntries();
		
		 // Non-empty Map API Utility
		 
		 Map<Integer,String> nonemptyImmutableMap = Map.ofEntries(Map.entry(1,"one"), Map.entry(2,"two"), Map.entry(3,"three"));
		 
	}

}

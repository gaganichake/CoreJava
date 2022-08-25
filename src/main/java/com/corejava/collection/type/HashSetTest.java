package com.corejava.collection.type;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<>();
		
		String value1 = "abc";
		String value2 = new String("abc");
		
		System.out.println("value1.hashCode() = "+ value1.hashCode());
		System.out.println("value2.hashCode() = "+ value2.hashCode());
		System.out.println("value1.equals(value2) = "+ value1.equals(value2));
		System.out.println("(value1 == value2) = "+ (value1 == value2));
		
		hashSet.add(value1);
		hashSet.add(value2);
		
		System.out.println("HashSet: "+hashSet);
		System.out.println("Conclusion: HashSet does NOT allow duplicate values. HashSet uses equals() to compare two keys. In other words value of the objects are compared.");
		
		System.out.println("\nNow, add a null value.");
		hashSet.add(null);
		System.out.println("HashSet: "+hashSet);
		System.out.println("Conclusion: HashSet allows null value.");
		
		System.out.println("\nNow, again add a value.");
		String key3 = "xyz";
		hashSet.add(key3);
		System.out.println("HashSet: "+hashSet);
		System.out.println("Conclusion: HashSet allows adding more values even if null is present in the Set.");
		
		
	}

}

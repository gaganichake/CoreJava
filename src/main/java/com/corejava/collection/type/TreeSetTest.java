package com.corejava.collection.type;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		Set<String> treeSet = new TreeSet<>();
		
		String value1 = "abc";
		String value2 = new String("abc");
		
		System.out.println("value1.hashCode() = "+ value1.hashCode());
		System.out.println("value2.hashCode() = "+ value2.hashCode());
		System.out.println("value1.equals(value2) = "+ value1.equals(value2));
		System.out.println("(value1 == value2) = "+ (value1 == value2));
		
		treeSet.add(value1);
		treeSet.add(value2);
		
		System.out.println("TreeSet: "+treeSet);
		System.out.println("Conclusion: TreeSet does NOT allow duplicate values. TreeSet uses equals() to compare two keys. In other words value of the objects are compared.");
		
		System.out.println("\nNow, add a null value.");
//		treeSet.add(null);
		System.out.println("TreeSet: "+treeSet);
		System.out.println("Conclusion: TreeSet does NOT allows null value.");
		
	}

}

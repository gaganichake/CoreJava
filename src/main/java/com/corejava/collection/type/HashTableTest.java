package com.corejava.collection.type;

import java.util.Hashtable;
import java.util.Map;

public class HashTableTest {

	public static void main(String[] args) {

		Map<String, Integer> hashTable = new Hashtable<>();
		
		String key1 = "abc";
		String key2 = new String("abc");
		
		System.out.println("key1.hashCode() = "+ key1.hashCode());
		System.out.println("key2.hashCode() = "+ key2.hashCode());
		System.out.println("key1.equals(key2) = "+ key1.equals(key2));
		System.out.println("(key1 == key2) = "+ (key1 == key2));
		
		hashTable.put(key1, 1);
		hashTable.put(key2, 2);
		
		System.out.println("Hashtable: "+hashTable);
		System.out.println("Conclusion: Hashtable uses equals() to compare two keys. In other words value of the objects are compared.");
		
		System.out.println("\nNow, add a null key.");
//		hashTable.put(null, 3); // NullPointerException
		System.out.println("Hashtable: "+hashTable);
		System.out.println("Conclusion: Hashtable does NOT allow null key.");
		
		System.out.println("\nNow, add a null value.");
		String key3 = "xyz";
//		hashTable.put(key3, null); // NullPointerException
		System.out.println("Hashtable: "+hashTable);
		System.out.println("Conclusion: Hashtable does NOT allow null value.");
		
		
	}

}

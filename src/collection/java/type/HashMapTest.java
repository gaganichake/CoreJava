package collection.java.type;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map hashMap = new HashMap();
		
		String key1 = "abc";
		String key2 = new String("abc");
		
		System.out.println("key1.hashCode() = "+ key1.hashCode());
		System.out.println("key2.hashCode() = "+ key2.hashCode());
		System.out.println("key1.equals(key2) = "+ key1.equals(key2));
		System.out.println("(key1 == key2) = "+ (key1 == key2));
		
		hashMap.put(key1, 1);
		hashMap.put(key2, 2);
		
		System.out.println("HashMap: "+hashMap);
		System.out.println("Conclusion: HashMap uses equals() to compare two keys. In other words value of the objects are compared.");
		
		System.out.println("\nNow, add a null key.");
		hashMap.put(null, 3);
		System.out.println("HashMap: "+hashMap);
		System.out.println("Conclusion: HashMap allows null key.");
		
		System.out.println("\nNow, add a null value.");
		String key3 = "xyz";
		hashMap.put(key3, null);
		System.out.println("HashMap: "+hashMap);
		System.out.println("Conclusion: HashMap allows null value.");
		
		
	}

}

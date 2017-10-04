package collection.java.type;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map treeMap = new TreeMap();
		
		String key1 = "abc";
		String key2 = new String("abc");
		
		System.out.println("key1.hashCode() = "+ key1.hashCode());
		System.out.println("key2.hashCode() = "+ key2.hashCode());
		System.out.println("key1.equals(key2) = "+ key1.equals(key2));
		System.out.println("(key1 == key2) = "+ (key1 == key2));
		
		treeMap.put(key1, 1);
		treeMap.put(key2, 2);
		
		System.out.println("TreeMap: "+treeMap);
		System.out.println("Conclusion: TreeMap uses equals() to compare two keys. In other words value of the objects are compared.");
		
		System.out.println("\nNow, add a null key.");
//		treeMap.put(null, 3);
		System.out.println("TreeMap: "+treeMap);
		System.out.println("Conclusion: TreeMap does NOT allows null key.");
		
	}

}

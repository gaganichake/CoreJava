package com.corejava.concurrency;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
		System.out.println(map);
		
		// This will through java.util.ConcurrentModificationException
//		Set<String> keySet = map.keySet();
//		
//		for(String key : keySet){
//			
//			if(key.equals("B")){
//				map.remove(key);
//			}
//		}
		
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()){
			
			Map.Entry<String, Integer> entry = iterator.next();
			
			if(entry.getKey().equals("A")){
				iterator.remove();
			}
		}
		
		System.out.println(map);
		System.out.println("Only iterator.remove() works. See ConcurrentHashMap for the solution.");

	}

}

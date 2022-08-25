package com.corejava.concurrency;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new ConcurrentHashMap<>();
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
		System.out.println(map);
		
		Set<String> keySet = map.keySet();
		
		for(String key : keySet){
			
			if(key.equals("B")){
				map.remove(key);
			}
		}
		
		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()){
			
			Map.Entry<String, Integer> enrty = iterator.next();
			
			if(enrty.getKey().equals("A")){
				iterator.remove();
			}
		}
		
		System.out.println(map);
		System.out.println("Both remove() worked in ConcurrentHashMap.");

	}

}

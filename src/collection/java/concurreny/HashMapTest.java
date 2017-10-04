package collection.java.concurreny;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
		System.out.println(map);
		
		// This will thorugh java.util.ConcurrentModificationException
//		Set<String> keySet = map.keySet();
//		
//		for(String key : keySet){
//			
//			if(key.equals("B")){
//				map.remove(key);
//			}
//		}
		
		Iterator iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()){
			
			Map.Entry<String, Integer> enrty = (Map.Entry<String, Integer>)iterator.next();
			
			if(enrty.getKey().equals("A")){
				iterator.remove();
			}
		}
		
		System.out.println(map);
		System.out.println("Only iterator.remove() works. See ConcurrentHashMap for the solution.");

	}

}

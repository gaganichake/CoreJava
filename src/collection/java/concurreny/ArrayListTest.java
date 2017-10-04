package collection.java.concurreny;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println(list);
		
		for(String element : list){
			
			if(element.equals("B")){
				list.remove(element);
			}
		}
		
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext()){
			
			String element = (String) iterator.next();
			
			if(element.equals("A")){
				iterator.remove();
			}
		}
		
		System.out.println(list);
		System.out.println("Both remove() work!");
	}

}

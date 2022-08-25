package com.corejava.concurrency;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		System.out.println(list);

		for(String element : list){

			if(element.equals("B")){
				list.remove(element);
			}
		}
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()){
			
			String element = iterator.next();
			
			if(element.equals("A")){
				iterator.remove();
			}
		}
		
		System.out.println(list);
		System.out.println("Both remove() worked!");
	}

}

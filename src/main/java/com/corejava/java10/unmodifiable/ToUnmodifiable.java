package com.corejava.java10.unmodifiable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToUnmodifiable {

	public static void main(String[] args) {
		
		var list1 = new ArrayList<Integer>();// Modifiable
		list1.add(1); // works 
		
		// Transforming to a new Unmodifiable list
		var list2 = list1.stream()
		        .map(number -> number*number)
		        .collect(Collectors.toUnmodifiableList());
		//list2.add(2);//try this, throws UnsupportedOperationException
		
		
		var list3 = List.of(1,2,3);// Already Unmodifiable
		//list3.add(2);//try this, throws UnsupportedOperationException
		
		// Transforming to a new normal list
		var list4 = list3.stream()
		        .map(number -> number*number)
		        .collect(Collectors.toList());
		list4.add(4);// works
		    
		 
		    //Also try on other collection types
//		    Collectors.toUnmodifiableSet();
//		    Collectors.toUnmodifiableMap(null, null);
//		    Collectors.toUnmodifiableMap(null, null, null);;
	}
}

package com.corejava.java10.unmodifiable;

import java.util.ArrayList;
import java.util.List;

public class CopyOf {

	public static void main(String[] args) {
		
		 var list = new ArrayList<>();// Modifiable
		 list.add(1); // works  
		 // Creates an UnModifiable List from a List.
		 var copylist =  List.copyOf(list);
		 //copylist.add(5);//try this, throws UnsupportedOperationException
	}

}

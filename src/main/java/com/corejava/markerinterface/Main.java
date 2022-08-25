package com.corejava.markerinterface;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		// Create someObject
		System.out.println("Create someObject");
		SomeObject someObject = new SomeObject();
		someObject.setName("Gagan");
		someObject.setAge(27);
		System.out.println(someObject);
		System.out.println("\n");
		
		// Create cloned object
		System.out.println("Create cloned object");
		// This won't work if you remove Cloneable interface from SomeObject class.
		SomeObject ref = (SomeObject)(someObject.clone());
		System.out.println(ref);
		System.out.println("\n");
		
		// Change state of someObject
		System.out.println("Change state of someObject");
		someObject.setName("Gagan Ichake");
		someObject.setAge(28);
		System.out.println(someObject);
		System.out.println("\n");
		
		// Cloned object after change in state of someObject
		System.out.println("Cloned object after change in state of someObject");
		System.out.println(ref);
		System.out.println("Hence cloned object is a new object");
		
	}

}

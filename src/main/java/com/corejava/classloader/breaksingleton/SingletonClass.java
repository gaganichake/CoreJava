package com.corejava.classloader.breaksingleton;

public class SingletonClass {

	private static SingletonClass singletonObject;

	//Provide a default Private constructor
	/** A private Constructor prevents any other class from instantiating. */
	
	private SingletonClass() {
		// Optional Code
		System.out.println("Damn, you did it!!!. In " +  SingletonClass.class.getName());
	}

	//Create a Method for getting the reference to the Singleton Object
	//Make the Access method Synchronized to prevent Thread Problems.
	public static synchronized SingletonClass getSingletonObject() {
		if (singletonObject == null) {
			singletonObject = new SingletonClass();
		}
		return singletonObject;
	}

	//Override the Object clone method to prevent cloning

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}

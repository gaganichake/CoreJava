package com.corejava.classloader.breaksingleton;

public class SingletonClass {

	private static SingletonClass singletonObject;
	private String value;

	//Provide a default Private constructor
	/** A private Constructor prevents any other class from instantiating. */
	
	private SingletonClass() {
		// Optional Code
		System.out.println("Damn, you did it!!!. In " +  SingletonClass.class.getName());
		this.value = "Some Value set by constructor";
	}

	//Create a Method for getting the reference to the Singleton Object
	//Make the Access method Synchronized to prevent more than one Thread to enter.
	public static synchronized SingletonClass getSingletonObject() {
		if (singletonObject == null) {
			singletonObject = new SingletonClass();
			singletonObject.setValue("Some Value set by getSingletonObject()");
		}
		return singletonObject;
	}

	//Override the Object clone method to prevent cloning

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}

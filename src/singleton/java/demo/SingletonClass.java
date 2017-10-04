package singleton.java.demo;

public class SingletonClass {

	/*
	 * Declare a class variable of this class type. Make it private and not provide any
	 * getter setter methods for this variable. This variable will hold your Singleton Object.
	 */	
	private static SingletonClass singletonObject;

	/*
	 * Make default constructor Private. Do not provide any overloaded constructor. 
	 * A private Constructor prevents any other class from instantiating.	
	 */
	private SingletonClass() {
		// Optional Code
	}

	/*
	 * Create a public method for getting the reference to the Singleton Object. 
	 * Also make this access method Synchronized to prevent Thread safety.
	 */
	public static synchronized SingletonClass getSingletonObject() {
		if (singletonObject == null) {
			singletonObject = new SingletonClass();
		}
		return singletonObject;
	}

	/*
	 * Override the Object's clone method to prevent cloning
	 */
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}

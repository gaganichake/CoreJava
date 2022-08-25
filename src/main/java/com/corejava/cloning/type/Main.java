package com.corejava.cloning.type;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		
		// Create myCloneableObject
		System.out.println("Create myCloneableObject");
		MyCloneableObject myCloneableObject = new MyCloneableObject();
		myCloneableObject.setName("Gagan");
		myCloneableObject.setAge(27);
		Address address = new Address();
		address.setPin(411028);
		address.setArea("Hadapsar");
		myCloneableObject.setAddress(address);
		System.out.println(myCloneableObject);
		
		// Create cloned object of myCloneableObject
		System.out.println("Create cloned object of myCloneableObject");
		// This won't work if you remove Cloneable interface from myCloneableObject class.
		MyCloneableObject myClonedObject = (MyCloneableObject)(myCloneableObject.clone());
		System.out.println(myClonedObject);
		System.out.println("Hence myClonedObject is an exact copy of myCloneableObject");
		System.out.println();
		
		// Change state of immutable object variables or primitive variables of myCloneableObject
		System.out.println("Change state of immutable object variables or primitive variables of myCloneableObject");
		myCloneableObject.setName("Gagan Ichake");// immutable
		myCloneableObject.setAge(28);// primitive
		System.out.println(myCloneableObject);
		
		// myClonedObject after change in state of immutable object variables or primitive variables of myCloneableObject
		System.out.println("myClonedObject after change in state of immutable object variables or primitive variables of myCloneableObject");
		System.out.println(myClonedObject);
		System.out.println("Hence myClonedObject is a new object");
		System.out.println();
		
		// Change state of non-immutable object variables or non-primitive variables of myCloneableObject
		System.out.println("Change state of non-immutable object variables or non-primitive variables of myCloneableObject");
		myCloneableObject.getAddress().setArea("Magarpatta");// non-immutable
		System.out.println(myCloneableObject);
		
		// myClonedObject after change in state of myCloneableObject
		System.out.println("myClonedObject after change in state of non-immutable object variables or non-primitive variables of myCloneableObject");
		System.out.println(myClonedObject);
		System.out.println("Hence myClonedObject is NOT completly new a object. It is refering to the same Address object which is in myCloneableObject.");
		System.out.println("It is called Shallow Cloning");
		System.out.println();
		
		// Create mySerializableObject
		System.out.println("Create mySerializableObject");
		MySerializableObject mySerializableObject = new MySerializableObject();
		mySerializableObject.setName("Gagan Ichake");
		mySerializableObject.setAge(27);
		Address address2 = new Address();
		address2.setPin(411028);
		address2.setArea("Hadapsar");
		mySerializableObject.setAddress(address2);
        System.out.println(mySerializableObject);
        
        // Create cloned object of mySerializableObject
        System.out.println("Create cloned object of mySerializableObject");
        saveObject(mySerializableObject.getAddress(), mySerializableObject.getAddress().getClass().getName());
        saveObject(mySerializableObject, mySerializableObject.getClass().getName());
        
		// Load mySerializedClonedObject
		System.out.println("Load mySerializedClonedObject");
        MySerializableObject mySerializedClonedObject = (MySerializableObject) loadObject(mySerializableObject.getClass().getName());
        mySerializedClonedObject.setAddress((Address)loadObject(mySerializableObject.getAddress().getClass().getName()));
        System.out.println(mySerializedClonedObject);
		System.out.println("Hence mySerializedClonedObject is an exact copy of mySerializableObject");
		System.out.println();
		
		// Change state of non-immutable object variables or non-primitive variables of mySerializableObject
		System.out.println("Change state of non-immutable object variables or non-primitive variables of mySerializableObject");
		mySerializableObject.getAddress().setArea("Magarpatta");// non-immutable
		System.out.println(mySerializableObject);
		
		// mySerializedClonedObject after change in state of mySerializableObject
		System.out.println("mySerializedClonedObject after change in state of non-immutable object variables or non-primitive variables of mySerializableObject");
		System.out.println(mySerializedClonedObject);
		System.out.println("Hence mySerializedClonedObject is completly a new object. It is NOT refering to the same Address object which is in mySerializableObject.");
		System.out.println("It is called Deep Cloning");
		System.out.println();
		
		System.out.println("One other and more simple way to achieve Deep Cloning is to create a deepClone() method within the class and manually populate all member variables/objects.");
		MyCloneableObject myDeepClonedObject = myCloneableObject.deepClone();
		System.out.println("myDeepClonedObject of myCloneableObject");
		System.out.println(myDeepClonedObject);
		System.out.println();
		
		// Change state of all type of variables of myCloneableObject
		System.out.println("Change state of all type of variables of myCloneableObject");
		myCloneableObject.setName("Gagan Rao Ichake");// immutable
		myCloneableObject.setAge(26);// primitive
		myCloneableObject.getAddress().setArea("Bhosale Gardan");// non-immutable
		System.out.println(myCloneableObject);
		
		// myDeepClonedObject after change in state of all type of variables of myCloneableObject
		System.out.println("myDeepClonedObject after change in state of all type of variables of myCloneableObject");
		System.out.println(myDeepClonedObject);
		System.out.println("Hence myDeepClonedObject is completly a new object.");
		System.out.println();
		
		
	}
	
    /**
     * Saves an object.
     */
    private static void saveObject(Serializable object, String filename) throws IOException {
        ObjectOutputStream objstream = new ObjectOutputStream(new FileOutputStream(filename));
        objstream.writeObject(object);
        objstream.close();
    }
 
    /**
     * Loads an object.
     */
    private static Object loadObject(String filename) throws ClassNotFoundException, IOException {
        ObjectInputStream objstream = new ObjectInputStream(new FileInputStream(filename));
        Object object = objstream.readObject();
        objstream.close();
        return object;
    }

}

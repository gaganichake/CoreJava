package com.corejava.classloader.breaksingleton;

import java.lang.reflect.Constructor;

public class Main {

	public static void main(String[] args) throws Exception {

		// load class by name
		Class<?> clazz = Class.forName("classloader.java.breaksingleton.SingletonClass");
		
		// getDeclaredConstructor(paramTypes) finds constructors with all visibility levels.
		// we supply no param types to get the default constructor
		Constructor<?> defaultConstructor = clazz.getDeclaredConstructor();
		defaultConstructor.setAccessible(true); // set visibility to public
		defaultConstructor.newInstance(); // instantiate the class
	}

}

package com.corejava.java8.interfaces;

public interface StaticMethod {
	
	// static method example
	static boolean isNull(String str) {
		System.out.println("Interface Null Check");
		return str == null;
	}

}

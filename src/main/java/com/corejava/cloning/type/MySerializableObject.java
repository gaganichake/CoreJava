package com.corejava.cloning.type;

import java.io.Serializable;

public class MySerializableObject implements Serializable {

	private static final long serialVersionUID = 8642228948381750174L;
	private String name;
	private int age;
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + ": name=" + (name == null ? "" : name) + ", age=" + age + ", address=" + (address == null ? "" : address);  
	}
	
}

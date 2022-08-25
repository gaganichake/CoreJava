package com.corejava.markerinterface;

public class SomeObject implements Cloneable{

	private String name;
	private int age;
	
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
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return this.getClass().getName() + ": name=" + (name == null ? "" : name) + ", age=" + age;  
	}
	

}

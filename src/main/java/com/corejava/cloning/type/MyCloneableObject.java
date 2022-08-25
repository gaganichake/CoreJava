package com.corejava.cloning.type;


public class MyCloneableObject implements Cloneable{

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
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public MyCloneableObject deepClone() {
		
		MyCloneableObject deepClone = new MyCloneableObject();
		deepClone.setName(this.name);
		deepClone.setAge(this.age);
		Address address = new Address();
		address.setPin(this.address.getPin());
		address.setArea(this.getAddress().getArea());
		deepClone.setAddress(address);
		
		return deepClone;
	}	
	
	@Override
	public String toString() {
		return this.getClass().getName() + ": name=" + (name == null ? "" : name) + ", age=" + age + ", addres=" + (address == null ? "" : address);  
	}
	
}

package com.corejava.transient_;

import java.io.Serializable;

public class NameStore implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 258055474961796542L;
	private final String firstName;
	private final transient String middleName;
	private final String lastName;
	public NameStore (String fName, String mName, String lName){
		this.firstName = fName;
		this.middleName = mName;
		this.lastName = lName;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("First Name : ");
		sb.append(this.firstName);
		sb.append(", ");
		sb.append(" Middle Name : ");
		sb.append(this.middleName);
		sb.append(", ");
		sb.append(" Last Name : ");
		sb.append(this.lastName);
		return sb.toString();
	}
}

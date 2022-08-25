package com.corejava.java9;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Employee<String> getEmployee(String empId) {

		// With the help of Diamond operator, we can create an object without mentioning the generic type on the right hand side of the expression.
		// But it will only work with normal classes
		// Before Java 7
		List<String> empIds1 = new ArrayList<>();

		// In Java 7
		List<String> empIds2 = new ArrayList<>();

		// With  anonymous inner class
		// In Java 7 & 8 it will throw compilation error: '<>' cannot be used with anonymous classes
		// Will work in Java 9
		return new Employee<>() {

			@Override
			public void setEmpID(String empId1) {
				this.empId = empId1;
			}

		};
	}

}

abstract class Employee<T> {

	T empId;

	abstract public void setEmpID(T empId);

	public T getEmpID(T empID) {
		return this.empId;
	}

}

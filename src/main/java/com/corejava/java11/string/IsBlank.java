package com.corejava.java11.string;

public class IsBlank {

	public static void main(String[] args) {
		
		String emptyText = "";
		String emptyTextWithSpace = "  ";
		String name = "John";
		
		System.out.println("emptyText isEmpty result: " + emptyText.isEmpty()); // true
		System.out.println("emptyText isBlank result: " + emptyText.isBlank()); // true
		
		System.out.println("emptyTextWithSpace isEmpty result: " + emptyTextWithSpace.isEmpty()); // false (because it contains spaces.)
		System.out.println("emptyTextWithSpace isBlank result: " + emptyTextWithSpace.isBlank()); // true

		System.out.println("name isEmpty result: " + name.isEmpty()); // false
		System.out.println("name isBlank result: " + name.isBlank()); // false
	}

}

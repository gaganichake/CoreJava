package com.corejava.java11.string;

import java.util.stream.Collectors;

public class Lines {

	public static void main(String[] args) {

		String text = "Hello\nSW Test Academy\nIt is a great site!\nGo and check!";
		System.out.println(text);
		
		var textList = text.lines() // lines() method creates a stream.
				.collect(Collectors.toList());
		System.out.println(textList);

	}

}

package com.corejava.java9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {

	}

	// Java SE 7 example
	void testARM_Before_Java9() throws IOException {
		try (BufferedReader reader2 = new BufferedReader(new FileReader("journaldev.txt"))) {
			System.out.println(reader2.readLine());
		}
	}

	//Java 9 example. Duplicate variable for reader not required
	void testARM_Java9() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("journaldev.txt"));
		try (reader) {
			System.out.println(reader.readLine());
		}
	}

}

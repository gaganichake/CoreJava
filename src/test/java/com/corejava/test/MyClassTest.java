package com.corejava.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.corejava.junit.MyClass;

public class MyClassTest {

	@Test
	public void testMultiply() {
		MyClass tester = new MyClass();
		assertEquals("Result", 50, tester.multiply(10, 5));
	}

}

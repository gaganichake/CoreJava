package com.corejava.concurrency;

import java.util.concurrent.CopyOnWriteArrayList;

/*
 * A thread-safe variant of java.util.ArrayList in which all mutative operations 
 * (add, set, and so on) are implemented by making a fresh copy of the underlying array.
 */
public class CopyOnWriteArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
	}

}

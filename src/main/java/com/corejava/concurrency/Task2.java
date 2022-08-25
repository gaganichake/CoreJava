package com.corejava.concurrency;

/*
 * There a couple of important changes here when we implement runnable.
 * 
 * 1. The result of task execution cannot be returned from the run() method. 
 * Hence, we are printing directly from here.
 * 
 * 2. The run() method is not configured to throw any checked exceptions.
 */
public class Task2 implements Runnable {

	private final String message;
	
	public Task2(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public void run() {
		System.out.println("Hello "  + message + "!");
	}

}

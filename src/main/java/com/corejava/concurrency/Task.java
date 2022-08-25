package com.corejava.concurrency;

import java.util.concurrent.Callable;

/*
 * The Task class implements Callable and is parameterized to String type. 
 * It is also declared to throw Exception. This ability to throw an exception 
 * to the executor and executor returning this throw Exception. This ability 
 * to throw an exception to the executor and executor returning this execution.
 */
public class Task implements Callable<String> {

	private final String message;
	
	public Task(String message) {
		super();
		this.message = message;
	}


	@Override
	public String call() {
		return "Hello "  + message + "!";
	}

}

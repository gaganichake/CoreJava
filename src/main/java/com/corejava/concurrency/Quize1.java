package com.corejava.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * https://docs.oracle.com/javase/tutorial/essential/concurrency/QandE/answers.html
 * 
 * Question: Can you pass a Thread object to Executor.execute? Would such an invocation make sense?
 * 
 * Answer: Thread implements the Runnable interface, so you can pass an instance of Thread to 
 * Executor.execute. However, it doesn't make sense to use Thread objects this way. If the object
 * is directly instantiated from Thread, its run method doesn't do anything. You can define a 
 * subclass of Thread with a useful run method — but such a class would implement features that 
 * the executor would not use.
 */
public class Quize1 {

	public static void main(String[] args) {
		
		Thread t = new Thread();
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(t);
	}

}

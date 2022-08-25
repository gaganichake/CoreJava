package com.corejava.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * http://knowledgebasement.com/what-are-concurrency-problems-and-how-to-avoid-them-in-java/
 */
public class RaceCondition {

	static int counter = 0;
	//volatile keyword here makes sure that the changes made in one thread are immediately reflect in other thread
	//Using volatile keyword does not require synchronization on getSynchronizedCounter(). Try it.
//	private static volatile int counter = 0;
	static AtomicInteger atomicCounter = new AtomicInteger(0);
	
	public static int getCounter() {
		return counter;
	}

	public static void setCounter() {
		RaceCondition.counter++;
	}
	
	public static synchronized int getSynchronizedCounter() {
		return counter;
	}

	public static synchronized void setSynchronizedCounter() {
		RaceCondition.counter++;
	}

	public static void main(String[] args) throws InterruptedException {
		
		threadUnsafe();//Race condition
		
		//rest counter
		counter = 0;
		
		threadSafeUsingSynchronized();
		
		threadSafeAtomicVariable();//

	}
	
	private static void threadUnsafe() throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 1000; i++)
			service.submit(RaceCondition::setCounter);
		service.shutdown();
		service.awaitTermination(10, TimeUnit.SECONDS);
		if (service.isShutdown())
			System.out.printf(" Total count: %d", RaceCondition.getCounter());
	}
	
	private static void threadSafeUsingSynchronized() throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 1000; i++)
			service.submit(RaceCondition::setSynchronizedCounter);
		service.shutdown();
		service.awaitTermination(10, TimeUnit.SECONDS);
		if (service.isShutdown())
			System.out.printf(" Total count: %d", RaceCondition.getSynchronizedCounter());
	}
	
	private static void threadSafeAtomicVariable() throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 1000; i++)
			service.submit(() -> atomicCounter.incrementAndGet());
		service.shutdown();
		service.awaitTermination(10, TimeUnit.SECONDS);
		if (service.isShutdown())
			System.out.printf(" Total count: %d", atomicCounter.get());
	}
	
}

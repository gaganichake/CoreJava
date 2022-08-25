package com.corejava.concurrency;

import java.util.concurrent.BlockingQueue;

public class ProducerThread implements Runnable {

	private static int capacity;
	private final BlockingQueue<Integer> intQueue;

	public ProducerThread(BlockingQueue<Integer> queue, int cap) {
		capacity = cap;
		this.intQueue = queue;
	}

	@Override
	public void run() {

		for (int i = 0; i < capacity; i++) {

			try {
				
				intQueue.put(i);
				
				System.out.println("Producer adding: " +  i);
				
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
		
		try {
			intQueue.put(-1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

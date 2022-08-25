package com.corejava.concurrency;

import java.util.concurrent.BlockingQueue;

public class ConsumerThread implements Runnable {

	private static int capacity;
	private final BlockingQueue<Integer> intQueue;

	public ConsumerThread(BlockingQueue<Integer> queue, int cap) {
		capacity = cap;
		this.intQueue = queue;
	}

	@Override
	public void run() {
		int num;
		for (int i = 0; i < capacity; i++) {

			try {
				num = intQueue.take();
				
				if (num == -1)
					break;

				System.out.println("Consumer removing:" + num);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

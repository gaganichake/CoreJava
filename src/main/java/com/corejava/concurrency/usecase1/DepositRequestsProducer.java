package com.corejava.concurrency.usecase1;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class DepositRequestsProducer implements Runnable {

	private final BlockingQueue<Long> queue;

	public DepositRequestsProducer(BlockingQueue<Long> q) {
		queue = q;
		Thread tread = new Thread(this);
		tread.start();
	}

	public void run() {

		Random randomGenerator = new Random();
		try {
			while (true) {
				int amount = randomGenerator.nextInt(100);
					queue.put((long) amount);
				Thread.yield();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

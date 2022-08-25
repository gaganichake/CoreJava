package com.corejava.concurrency.usecase1;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class WithdrawRequestsProducer implements Runnable {

	private final BlockingQueue<Long> queue;

	public WithdrawRequestsProducer(BlockingQueue<Long> q) {
		queue = q;
		Thread thread = new Thread(this);
		thread.start();
	}

	public void run() {
		try {
			Random randomGenerator = new Random();
			while (true) {
				int amount = randomGenerator.nextInt(300);
					queue.put((long) (amount * -1));
				Thread.yield();
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

}

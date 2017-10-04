package conccurency.java.example;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class WithdrawRequestsProducer implements Runnable {

	private Thread thread;
	private BlockingQueue<Long> queue;

	public WithdrawRequestsProducer(BlockingQueue<Long> q) {
		queue = q;
		thread = new Thread(this);
		thread.start();
	}

	public void run() {
		try {
			Random randomGenerator = new Random();
			while (true) {
				int amount = randomGenerator.nextInt(300);
				queue.put(new Long(amount * -1));
				Thread.yield();
			}

		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

}

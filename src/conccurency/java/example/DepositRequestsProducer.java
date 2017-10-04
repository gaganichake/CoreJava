package conccurency.java.example;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class DepositRequestsProducer implements Runnable {

	private Thread tread;
	private BlockingQueue<Long> queue;

	public DepositRequestsProducer(BlockingQueue<Long> q) {
		queue = q;
		tread = new Thread(this);
		tread.start();
	}

	public void run() {
		try {
			Random randomGenerator = new Random();
			while (true) {
				int amount = randomGenerator.nextInt(100);
				queue.put(new Long(amount));
				Thread.yield();
			}

		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

}

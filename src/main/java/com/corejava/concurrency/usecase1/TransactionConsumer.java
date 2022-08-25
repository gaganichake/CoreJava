package com.corejava.concurrency.usecase1;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.concurrent.BlockingQueue;

public class TransactionConsumer implements Runnable {

	private final BlockingQueue<Long> queue;
	private final Account account;

	public TransactionConsumer(BlockingQueue<Long> q, Account account,
			int thread) {
		queue = q;
		this.account = account;
		Thread tread = new Thread(this, "Consumer_" + thread);
		tread.start();
	}

	public void run() {
		long request, result = 0;
		Runtime s_runtime = Runtime.getRuntime();

		NumberFormat numberFormat = NumberFormat.getNumberInstance();
		numberFormat.setRoundingMode(RoundingMode.DOWN);

		try {
			while (true) {
				request = queue.take();
					result = account.transfer(request);

				double freeMemory = (s_runtime.freeMemory() / 1048576);

				System.out
						.println("Calculated result after add "
								+ request
								+ " is "
								+ result
								+ " -- Free Memory: "
								+ numberFormat.format(freeMemory)
								+ " / "
								+ numberFormat.format(s_runtime.totalMemory() / 1048576));
			}

		} catch (InterruptedException ex) {
			ex.printStackTrace();
		} catch (CorruptedAccountException cx) {
			cx.printStackTrace();
		}


		System.exit(0);
	}

}

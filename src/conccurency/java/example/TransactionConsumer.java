package conccurency.java.example;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.concurrent.BlockingQueue;

public class TransactionConsumer implements Runnable {

	private Thread tread;
	private BlockingQueue<Long> queue;
	private Account account;

	public TransactionConsumer(BlockingQueue<Long> q, Account account,
			int thread) {
		queue = q;
		this.account = account;
		tread = new Thread(this, "Consumer_" + thread);
		tread.start();
	}

	public void run() {
		long request, result = 0;
		Runtime s_runtime = Runtime.getRuntime();

		NumberFormat numberFormat = NumberFormat.getNumberInstance();
		numberFormat.setRoundingMode(RoundingMode.DOWN);

		try {
			while (true) {
				request = queue.take().longValue();
				try {
					result = account.transfer(request);
				} catch (CorruptedAccountException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

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
		}

		System.exit(0);
	}

}

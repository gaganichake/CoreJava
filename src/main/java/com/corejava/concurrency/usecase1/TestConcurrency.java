package com.corejava.concurrency.usecase1;

import java.util.concurrent.ArrayBlockingQueue;

public class TestConcurrency {

	public static void main(String[] args) {
		Account account = new Account();
		final ArrayBlockingQueue<Long> queue = new ArrayBlockingQueue<>(40);

		for (int i = 0; i < 15; i++)
			new TransactionConsumer(queue, account, i);

		for (int i = 0; i < 30; i++) {
			new Thread(new DepositRequestsProducer(queue)).start();
			new Thread(new WithdrawRequestsProducer(queue)).start();
		}
	}
}

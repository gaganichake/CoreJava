package com.corejava.concurrency.usecase1;

import java.util.concurrent.locks.ReentrantLock;

public class Account {
	private static final ReentrantLock lock = new ReentrantLock(true);
	private long balance = 200;

	public Account() {
	}

	public long transfer(long amount) throws CorruptedAccountException {
//		lock.lock();
//		try {
			if (balance < 0)
				throw new CorruptedAccountException();

			if ((balance + amount) < 0)
				return balance;

			// This emulate a complex task after the control and before the
			// operation that affect the shared variable.
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			balance += amount;

			return balance;

//		} finally {
//			lock.unlock();
//		}
	}
}

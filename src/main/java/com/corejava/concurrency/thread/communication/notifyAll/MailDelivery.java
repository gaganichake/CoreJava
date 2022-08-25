package com.corejava.concurrency.thread.communication.notifyAll;

import java.util.ArrayList;
import java.util.List;

public class MailDelivery extends Thread {
	
	private final List<String> mailList = new ArrayList<>();

	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 1000; i++) {
				System.out.println("Mail received. (" + i + ")");
				mailList.add("Email " + i);
			}
			
			// If you use notify(), one and ONLY one thread in mailDelivery's waiting pool will be notified and resume processing.
			//notify();
			
			// If you use notifyAll(), all thread in mailDelivery's waiting pool will be notified and any thread can resume processing.
			notifyAll();
		}
	}

	public List<String> getMailList() {
		return mailList;
	}
	
}

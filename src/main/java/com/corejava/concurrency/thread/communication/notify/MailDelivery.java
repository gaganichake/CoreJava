package com.corejava.concurrency.thread.communication.notify;

import java.util.ArrayList;
import java.util.List;

public class MailDelivery extends Thread {
	
	private final List<String> mailList = new ArrayList<>();

	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Mail received. (" + i + ")");
				mailList.add("Mail: " + i);
			}
			 notify();
		}
	}

	public List<String> getMailList() {
		return mailList;
	}
	
}

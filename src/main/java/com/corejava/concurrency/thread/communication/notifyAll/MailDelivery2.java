package com.corejava.concurrency.thread.communication.notifyAll;

import java.util.List;

public class MailDelivery2 extends Thread {
	
	private final List<String> mailList;
	
	public MailDelivery2(List<String> mailList) {
		super();
		this.mailList = mailList;
	}

	public void run() {
		synchronized (mailList) {
			for (int i = 1; i <= 100000; i++) {
				//System.out.println("Mail received. (" + i + ")");
				mailList.add("Email " + i);
			}
			
			// If you use notify(), one and ONLY one thread in mailDelivery's waiting pool will be notified and resume processing.
			//mailList.notify();
			
			// If you use notifyAll(), all thread in mailDelivery's waiting pool will be notified and any thread can resume processing.
			mailList.notifyAll();
		}
	}

	public List<String> getMailList() {
		return mailList;
	}
	
}

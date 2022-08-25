package com.corejava.concurrency.thread.threadexecutor;

import java.util.ArrayList;
import java.util.List;

public class MailDelivery extends Thread {
	
	volatile boolean jobComplete = false; 
	private final List<String> mailList = new ArrayList<>();

	public void run() {
		setJobComplete(false);
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Mail received. (" + i + ")");
				mailList.add("Email " + i);
			}
		}
		setJobComplete(true);
	}

	public List<String> getMailList() {
		return mailList;
	}

	public boolean isJobComplete() {
		return jobComplete;
	}

	private void setJobComplete(boolean jobComplete) {
		this.jobComplete = jobComplete;
	}

}

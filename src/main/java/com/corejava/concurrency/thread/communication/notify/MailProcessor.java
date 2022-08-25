package com.corejava.concurrency.thread.communication.notify;

import java.util.List;

public class MailProcessor {

	final MailDelivery mailDelivery = new MailDelivery();

	public static void main(String[] args) {

		MailProcessor mailProcessor = new MailProcessor();
		mailProcessor.mailDelivery.start();

		synchronized (mailProcessor.mailDelivery) {
			try {
				System.out.println("Waiting for mailDelivery to complete...");
				// Do it in a while loop because wait may be interrupted by something.
				while(mailProcessor.mailDelivery.getMailList().isEmpty()){
					mailProcessor.mailDelivery.wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			readMails(mailProcessor.mailDelivery.getMailList());
		}
	}
	
	public static void readMails(List<String> mailList){
		System.out.println("Total mails " + mailList.size() + "\n");
	}

}

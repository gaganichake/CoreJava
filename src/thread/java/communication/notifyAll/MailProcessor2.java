package thread.java.communication.notifyAll;

import java.util.ArrayList;
import java.util.List;

public class MailProcessor2 extends Thread {

	private String name;
	private MailDelivery2 mailDelivery2;
	
	public MailProcessor2(String name, MailDelivery2 mailDelivery2) {
		super();
		this.name = name;
		this.mailDelivery2 = mailDelivery2;
	}

	public void run() {
		// Getting lock in "mailList" object as it is the critical thing. This is reason wait/notify methods are provided in Object class.
		synchronized (mailDelivery2.getMailList()) {
			try {
				System.out.println(this.name + " Waiting for mailDelivery to complete...\n");
				while(mailDelivery2.getMailList().isEmpty()){ // Do it in a while loop because wait may be interrupted by something.
					mailDelivery2.getMailList().wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + " reading mails...");
			readMails(mailDelivery2.getMailList());
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MailDelivery2 mailDelivery2 = new MailDelivery2(new ArrayList<String>());
		new MailProcessor2("Thread_1", mailDelivery2).start();
		new MailProcessor2("Thread_2", mailDelivery2).start();
		new MailProcessor2("Thread_3", mailDelivery2).start();
		mailDelivery2.start();

		
	}
	
	public static void readMails(List<String> mailList){
		System.out.println("Total mails " + mailList.size() + "\n");
	}

}

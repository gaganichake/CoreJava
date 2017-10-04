package thread.java.communication.notifyAll;

import java.util.List;

public class MailProcessor extends Thread {

	private String name;
	private MailDelivery mailDelivery;
	
	public MailProcessor(String name, MailDelivery mailDelivery) {
		super();
		this.name = name;
		this.mailDelivery = mailDelivery;
	}

	public void run() {
		synchronized (mailDelivery) {
			try {
				System.out.println(this.name + " Waiting for mailDelivery to complete...\n");
				while(mailDelivery.getMailList().isEmpty()){ // Do it in a while loop because wait may be interrupted by something.
					mailDelivery.wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(this.name + " reading mails...");
			readMails(mailDelivery.getMailList());
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MailDelivery mailDelivery = new MailDelivery();
		new MailProcessor("Thread_1", mailDelivery).start();
		new MailProcessor("Thread_2", mailDelivery).start();
		new MailProcessor("Thread_3", mailDelivery).start();
		mailDelivery.start();

		
	}
	
	public static void readMails(List<String> mailList){
		System.out.println("Total mails " + mailList.size() + "\n");
	}

}

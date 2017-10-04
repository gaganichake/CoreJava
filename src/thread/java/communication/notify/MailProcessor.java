package thread.java.communication.notify;

import java.util.List;

public class MailProcessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MailDelivery mailDelivery = new MailDelivery();
		mailDelivery.start();

		synchronized (mailDelivery) {
			try {
				System.out.println("Waiting for mailDelivery to complete...");
				while(mailDelivery.getMailList().isEmpty()){ // Do it in a while loop because wait may be interrupted by something.
					mailDelivery.wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			readMails(mailDelivery.getMailList());
		}
	}
	
	public static void readMails(List<String> mailList){
		System.out.println("Total mails " + mailList.size() + "\n");
	}

}

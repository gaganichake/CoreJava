package thread.java.threadexecutor;

import java.util.List;

public class MailProcessor {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		MailDelivery mailDelivery = new MailDelivery();
		mailDelivery.start();
		try {
			Thread.sleep(5*1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		if(mailDelivery.isJobComplete()){
			readMails(mailDelivery.getMailList());
		} else {
			mailDelivery.interrupt();
			throw new Exception("Job not completed.");
		}
	}
	
	public static void readMails(List<String> mailList){
		System.out.println("Total mails " + mailList.size() + "\n");
	}

}

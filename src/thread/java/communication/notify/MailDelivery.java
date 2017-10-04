package thread.java.communication.notify;

import java.util.ArrayList;
import java.util.List;

public class MailDelivery extends Thread {
	
	private List<String> mailList = new ArrayList<String>();

	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Mail received. (" + i + ")");
				mailList.add("Email " + i);
			}
			notify();
		}
	}

	public List<String> getMailList() {
		return mailList;
	}
	
}

package dateformat.java.date;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
			Date date = null;
			try {
				date = new SimpleDateFormat("yyyyMMdd").parse("20101117");
			} catch (Exception e) {
				e.printStackTrace();
			}
			Timestamp timestamp =  new Timestamp(date.getTime());
			System.out.println(timestamp);
		}	

}

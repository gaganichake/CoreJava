package calendar.java.actualmaximum;

import java.util.Calendar;
import java.util.Date;

public class ActualMaximum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date(2008,1,1));
		
		System.out.println("ActualMaximum: "+calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("Maximum: "+calendar.getMaximum(Calendar.DAY_OF_MONTH));
	}

}

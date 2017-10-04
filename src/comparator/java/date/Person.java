package comparator.java.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Person implements Comparable<Person>{
	
	private String name;
	private Double percentage;
	private Calendar dob;
		
	public int compareTo(Person o) {
		
		if(this.name.compareTo(o.getName()) == 0){
			return this.dob.compareTo(o.getDob());
		} else {
			return this.name.compareTo(o.getName());
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPercentage() {
		return percentage;
	}


	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}


	public Calendar getDob() {
		return dob;
	}


	public void setDob(Calendar dob) {
		this.dob = dob;
	}


	@Override
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy");
		return this.getClass().getName() + " [" + "name=" + this.name + ", percentage=" + this.percentage + ", dob=" + format.format(this.dob.getTime()) + "]";
	}

}

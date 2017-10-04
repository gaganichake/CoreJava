package comparator.java.date;

import java.util.Collections;
import java.util.GregorianCalendar;

public class TestComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SpecialOrderLine specialOderLine = new SpecialOrderLine();

		Person person1 = new Person();
		person1.setName("Parimal");
		person1.setPercentage(59.5);
		person1.setDob(new GregorianCalendar(1982, 4, 23));
		
		Person person2 = new Person();
		person2.setName("Chris");
		person2.setPercentage(10.14);
		person2.setDob(new GregorianCalendar(1877, 5, 7));
		
		Person person3 = new Person();
		person3.setName("Parimal");
		person3.setPercentage(79.8);
		person3.setDob(new GregorianCalendar(1981, 11, 15));
		
		Person person4 = new Person();
		person4.setName("Parimal");
		person4.setPercentage(60.9);
		person4.setDob(new GregorianCalendar(1981, 11, 15));
		
		System.out.println("Person List:");
		specialOderLine.getPersonList().add(person1);
		specialOderLine.getPersonList().add(person2);
		specialOderLine.getPersonList().add(person3);
		specialOderLine.getPersonList().add(person4);
		
		for(Person person : specialOderLine.getPersonList()){
			
			System.out.println(person);
		}
		
		System.out.println("\nSorted Person List:");
		Collections.sort(specialOderLine.getPersonList());
		for(Person person : specialOderLine.getPersonList()){
			
			System.out.println(person);
		}
		
		System.out.println("\nSorted Person Set:");
		specialOderLine.getPersonSet().add(person1);
		specialOderLine.getPersonSet().add(person2);
		specialOderLine.getPersonSet().add(person3);
		specialOderLine.getPersonSet().add(person4);
		for(Person person : specialOderLine.getPersonSet()){
			
			System.out.println(person);
		}
	}

}

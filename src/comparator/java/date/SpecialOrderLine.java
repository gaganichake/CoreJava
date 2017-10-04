package comparator.java.date;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SpecialOrderLine {

	private int orderNoumber;
	private List<Person> personList = new ArrayList<Person>();
	private Set<Person> personSet = new TreeSet<Person>(new PercentageComparator());
	
	class PercentageComparator implements Comparator<Person>{

		public int compare(Person person1,	Person person2) {
			
			if(person1.compareTo(person2) == 0){
				return person1.getPercentage().compareTo(person2.getPercentage());
			} else {
				return person1.compareTo(person2);
			}
		}
	}


	public int getOrderNoumber() {
		return orderNoumber;
	}


	public void setOrderNoumber(int orderNoumber) {
		this.orderNoumber = orderNoumber;
	}


	public List<Person> getPersonList() {
		return personList;
	}


	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}


	public Set<Person> getPersonSet() {
		return personSet;
	}


	public void setPersonSet(Set<Person> personSet) {
		this.personSet = personSet;
	}

}

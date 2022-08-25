package com.corejava.comparator.date;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SpecialOrderLine {

	private int orderNumber;
	private List<Person> personList = new ArrayList<>();
	private Set<Person> personSet = new TreeSet<>(new PercentageComparator());
	
	static class PercentageComparator implements Comparator<Person>{

		public int compare(Person person1,	Person person2) {
			
			if(person1.compareTo(person2) == 0){
				return person1.getPercentage().compareTo(person2.getPercentage());
			} else {
				return person1.compareTo(person2);
			}
		}
	}


	public int getOrderNumber() {
		return orderNumber;
	}


	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
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

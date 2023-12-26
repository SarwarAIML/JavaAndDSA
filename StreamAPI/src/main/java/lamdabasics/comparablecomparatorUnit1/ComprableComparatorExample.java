package lamdabasics.comparablecomparatorUnit1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComprableComparatorExample {

	public static void main(String[] args) {
		
		//step 1: sort list by last name
		
		//step 2: create method that print all elements in the list 
		
		// step 3 : create a method that print all people whose last name 
		//begins with C
		
		Person person1 = new Person("Charles", "Dickens", 60);
		Person person2 = new Person("Lewis", "Carrol", 42);
		Person person3 = new Person("Thomas", "Charle", 51);
		Person person4 = new Person("Charlatte", "Branate", 45);
		Person person5 = new Person("Mathew", "Arnold", 45);
		List<Person> people = new ArrayList<Person>();
		people.add(person1);
		people.add(person2);
		people.add(person3);
		people.add(person4);
		people.add(person5);
		
		Comparator<Person> lastNameComparator = (o1,o2) ->o1.getLastName().compareTo(o2.getLastName());
		
		
	}

}

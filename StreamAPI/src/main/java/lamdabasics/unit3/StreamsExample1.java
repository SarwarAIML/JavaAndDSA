package lamdabasics.unit3;

import java.util.ArrayList;
import java.util.List;

import lamdabasics.comparablecomparatorUnit1.Person;

public class StreamsExample1 {

	public static void main(String[] args) {
		
		
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

	}

}

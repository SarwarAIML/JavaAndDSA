package lamdabasics.unit3;

import java.util.ArrayList;
import java.util.List;

import lamdabasics.comparablecomparatorUnit1.Person;

public class ColletionJava8forEaachExample {

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
		
		System.out.println("printing collection with for loop");
		for(int i=0;i<people.size();i++)
		{
			System.out.println(people.get(i));
		}
		
		System.out.println("---printing collection with for in loop ---------");
		
		for(Person p:people)
		{
			System.out.println(p);
		}
		System.out.println("---------printing the collection with forEach()");
		//this can be replace by lambda method reference
	//	people.forEach(p->System.out.println(p));
		System.out.println("");
		people.forEach(System.out::println);
	}

}

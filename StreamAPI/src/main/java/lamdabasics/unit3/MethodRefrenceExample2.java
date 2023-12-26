package lamdabasics.unit3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import lamdabasics.comparablecomparatorUnit1.Person;

public class MethodRefrenceExample2 {

	public static void main(String[] args) {
		
	//step 1: sort list by last name
		
		//step 2: create method that print all elements in the list 
		
		// step 3 : create a method that print all people whose last name Begging with C
		
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

	//	printAll(people);
		performConditionally(people,p ->true,p ->System.out.println(p));//   p ->System.out.println(p) == System.out::println
		System.out.println("--------------------------method refrence equivalant of above statement--------------------------------------------");
		//
		performConditionally(people,p ->true,System.out::println);// p->method(p) 
		
		//
	}
		private static void performConditionally(List<Person> people, Predicate<Person> predicate,Consumer<Person> consumer) {
			for(Person p:people)
			{
				if(predicate.test(p))
				{
					consumer.accept(p);
				}
			}
		
	}

	

	
}

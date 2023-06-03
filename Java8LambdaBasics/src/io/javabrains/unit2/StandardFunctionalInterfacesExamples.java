package io.javabrains.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.javabrains.*;

public class StandardFunctionalInterfacesExamples {
	
	
	public static void performConditionally (List<Person> people, Predicate<Person> condition, Consumer<Person> consumer) {
		for(Person person: people) 
			if (condition.test(person))
				consumer.accept(person);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(
             new Person("Charles","Dickens",60),
             new Person("Lewis","Carroll",42),
             new Person("Thomas", "Carlyle", 51),
             new Person("Charlotte","Bronte",45),
             new Person("Matthew","Arnold",39)
             
		);
		
//		Step1: Sort list by last name
		
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		
//		Step2: Create a method prints all elements in the list
//		printPeople(people);
		performConditionally(people,p->true, p->System.out.println(p));
		
		System.out.println("-------------------------------\n");
		
//		Step3: Create a method that prints all people that have last name beggining with C
		
		System.out.println("\n-------------------------------\n");
		
		performConditionally(people, p->p.getLastName().startsWith("C"), p->System.out.println(p));
		
		
		
		System.out.println("\n-------------------------------\n");
		
		performConditionally(people, p->p.getFirstName().startsWith("C"), p->System.out.println(p.getFirstName()));

		
	}
	
//	interface Condition{
//		public boolean test(Person p);
//	}

}

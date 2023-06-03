package io.javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//import io.javabrains.Unit1Exercise2.Condition;

public class Unit1Exercise1 {
	
	public static void printPeople(List<Person> people) {
		System.out.println("List of People:");
		for(Person person: people)
			System.out.println(person.toString());
	}
	
	public static void printIfLastNameStartsWithC(List<Person> people) {
		System.out.println("List of People with Last Name starting with C:");
		for(Person person: people) {
			if (person.getLastName().charAt(0) == 'C' || person.getLastName().charAt(0) == 'c')
				System.out.println(person.toString());
		}
	}
	
	public static void printConditionally (List<Person> people, Condition condition) {
		System.out.println("List of People that respect condition:");
		for(Person person: people) 
			if (condition.test(person))
				System.out.println(person.toString());
		
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
		Collections.sort(people, new Comparator<Person>() {
			  @Override
			  public int compare(Person p1, Person p2) {
			    return p1.getLastName().compareTo(p2.getLastName());
			  }
		});
		
		
//		Step2: Create a method prints all elements in the list
		printPeople(people);
		
		System.out.println("-------------------------------\n");
		
//		Step3: Create a method that prints all people that have last name beggining with C
		printIfLastNameStartsWithC(people);
		
		System.out.println("\n-------------------------------\n");
		
		printConditionally (people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});

		
	}
	


}


interface Condition{
	public boolean test(Person p);
}
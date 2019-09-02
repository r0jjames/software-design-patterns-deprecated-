package behavioral_patterns.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard amexCard = new CreditCard(new AmexStrategy());
		amexCard.setNumber("379185883464283");
		amexCard.setDate("04/2020");
		amexCard.setCvv("123");
		System.out.println("Is Amex Card Valid: " + amexCard.isValid());
		
		
		CreditCard visaCard = new CreditCard(new VisaStrategy());
		visaCard.setNumber("4539589763663402");
		visaCard.setDate("05/2018");
		visaCard.setCvv("324");
		System.out.println("Is Visa Card Valid: " + visaCard.isValid());
		
		
	}
	
	public static void everydayExample() {
		Person roj = new Person("Roj James", "012345", 26);
		Person camille = new Person("Camille", "54321", 27);
		Person mark = new Person("Mark", "00000", 40);
		List<Person> persons = new ArrayList<>();
		persons.add(mark);
		persons.add(roj);
		persons.add(camille);
		
		System.out.println("Not sorted");
		printContents(persons);
		System.out.println("---------");
		System.out.println("Sorted by Age");
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				
				if (o1.getAge() > o2.getAge()) {
					return 1;
				}
				
				if(o1.getAge() < o2.getAge()) {
					return -1;
				}
				return 0;
			}
			
		});
		
		printContents(persons);
		
		System.out.println("---------");
		System.out.println("Sorted by Name");
		
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		printContents(persons);
	}
	
	public static void printContents(List<Person> persons) {
		for (Person person : persons) {
			System.out.println(person.getName());
		}
	}
	

}

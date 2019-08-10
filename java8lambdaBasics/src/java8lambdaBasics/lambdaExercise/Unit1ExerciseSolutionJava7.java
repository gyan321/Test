package java8lambdaBasics.lambdaExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {

	public static void main(String[] args) {
		 List<Person> list = Arrays.asList(
				 new Person("Charles","Dicken",35),
				 new Person("Lewis","Carrol",24),
				 new Person("Thomas","Caryle",41),
				 new Person("Charolot","Brante",23),
				 new Person("Mathew","Anthew",34)
				 
				 ); 
		 
		 
		 //1.sort list by the first name.
		 Collections.sort(list, new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				 
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
			 
			 
		 });
		 
		 //create a method that will print all the elements of the list
		 printAll(list);
		 
		 // create a method that will print person with the last name begining with c
		   printAllWithLastNameC(list);
	}
	
	private static void printAllWithLastNameC(List<Person> list) { 
		for(Person each:list){
			if(each.getLastName().startsWith("C")){
			System.out.println(each);
			}
		}  
		
	}

	public static void printAll( List<Person> list){
		
		for(Person each:list){
			System.out.println(each);
		}  
	}

}

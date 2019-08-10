package java8lambdaBasics.lambdaExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<Person> list = Arrays.asList(
				 new Person("Charles","Dicken",35),
				 new Person("Lewis","Carrol",24),
				 new Person("Thomas","Caryle",41),
				 new Person("Charolot","Brante",23),
				 new Person("Mathew","Anthew",34)
				 
				 ); 
		 
		 
		 //1.sort list by the first name.
		 Collections.sort(list, (p1,p2)-> p1.getFirstName().compareTo(p2.getFirstName()) );
		 
		 //create a method that will print all the elements of the list
		   printAll(list);
		 
		 // create a method that will print person with the last name beginning with c
		   printAllWithLastNameC(list,p->p.getLastName().startsWith("C")); 
		 
		    

	}
	
	private static void printAllWithLastNameC(List<Person> list, Conditionally condition) { 
		for(Person each:list){
			if(condition.test(each)){
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

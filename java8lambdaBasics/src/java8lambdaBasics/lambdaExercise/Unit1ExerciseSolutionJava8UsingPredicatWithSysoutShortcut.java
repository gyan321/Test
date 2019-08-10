package java8lambdaBasics.lambdaExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8UsingPredicatWithSysoutShortcut {
	public static void main(String[] args) {
		 
		
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
		 justPerformAction(list,p->true,p->System.out.println(p));
		 
		 // create a method that will print person with the last name beginning with c
		 justPerformAction(list,p->p.getLastName().startsWith("C"),p->System.out.println(p.getLastName())); 
		 
		    

	}
	
	private static void justPerformAction(List<Person> list, Predicate<Person> condition,Consumer<Person> consumer) { 
		for(Person each:list){
			if(condition.test(each)){
				consumer.accept(each); 
				} 
		}  
		
	}

}

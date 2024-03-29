package java8lambdaBasics.lambdaExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		 
		
		 List<Person> list = Arrays.asList(
				 new Person("Charles","Dicken",35),
				 new Person("Lewis","Carrol",24),
				 new Person("Thomas","Caryle",41),
				 new Person("Charolot","Brante",23),
				 new Person("Mathew","Anthew",34)
				 
				 ); 
		 
		  
		 
		 //create a method that will print all the elements of the list
		 justPerformAction(list,p->true, System.out::println); //this type:- (P)->METHOD(P);

	}
	
	private static void justPerformAction(List<Person> list, Predicate<Person> condition,Consumer<Person> consumer) { 
		for(Person each:list){
			if(condition.test(each)){
				consumer.accept(each); 
				} 
		}  
		
	}

}

package java8lambdaBasics.lambdaExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ForEachIteration {

	public static void main(String[] args) {
		 
		
		 List<Person> list = Arrays.asList(
				 new Person("Charles","Dicken",35),
				 new Person("Lewis","Carrol",24),
				 new Person("Thomas","Caryle",41),
				 new Person("Charolot","Brante",23),
				 new Person("Mathew","Anthew",34)
				 
				 );

		 /*for(int i=0;i<=list.size();i++){
			 System.out.println(list.get(i));
		 }*/
		 
		 for(Person each:list){
			 System.out.println(each);
		 }
		 System.out.println("------------------------");
		 list.forEach(p-> System.out.println(p));
		 list.forEach(  System.out::println);
		 
		 
	}

}

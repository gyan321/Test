package java8lambdaBasics.lambdaExercise;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {

	public static void main(String[] args) {
		 
		
		 List<Person> list = Arrays.asList(
				 new Person("Charles","Dicken",35),
				 new Person("Lewis","Carrol",24),
				 new Person("Thomas","Caryle",41),
				 new Person("Charolot","Brante",23),
				 new Person("Mathew","Anthew",34)
				 );
		 
		 list.stream()
		 .filter(p->p.getLastName().startsWith("C"))//predicate which accept an argument and return boolean
		 .forEach(p->System.out.println(p.getLastName()+""+p.getAge())); //accept an argument and return void
		 
	}

}

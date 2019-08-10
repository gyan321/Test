package java8lambdaBasics.lambdaExercise;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		int myArray[]={1,2,3,4,5};
		
		int constantValue=2;
		 
		//normal way
		processAddition1(myArray,constantValue);
		
		//lambda expression way
		processAddition2(myArray,constantValue,(f,s)->System.out.println(f+s));
	  
	}

	//normal way
	private static void processAddition1(int[] myArray, int constantValue) {
		 
		for(int each:myArray){
			System.out.println(each+constantValue);
		}
		
	}
	
	//lambda expression way
	private static void processAddition2(int[] myArray, int constantValue,BiConsumer<Integer,Integer>consumer) {
		
		for(int each:myArray){
		consumer.accept(each,constantValue);
		}
		 
	}

}

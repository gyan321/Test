package java8lambdaBasics.lambdaExercise;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample1stLambdaWay {

public static void main(String[] args) {
		
		int myArray[]={1,2,3,4,5};
		
		int constantValue=0;
		 
		//normal way
		processAddition1(myArray,constantValue);
		
		//lambda expression way
		processAddition2(myArray,constantValue,(f,s)->{
		
		
		try{
		  System.out.println(f/s);
		}
		catch(ArithmeticException ae){
			System.out.println(ae);
		}
	}  );
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

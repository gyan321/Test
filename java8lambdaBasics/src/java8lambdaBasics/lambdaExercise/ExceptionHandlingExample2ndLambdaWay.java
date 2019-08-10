package java8lambdaBasics.lambdaExercise;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample2ndLambdaWay {

public static void main(String[] args) {
		
		int myArray[]={1,2,3,4,5};
		
		int constantValue=0;
		 
		//normal way
		processAddition1(myArray,constantValue);
		
		//lambda expression way
		processAddition2(myArray,constantValue,bipassMethod((f,s)-> System.out.println(f/s)));


}


/// in this way the exception are not directly written over the lambda expression itself, 
//but rather written in the another method------------lambda expression is separated from exception --tru=y and catch() block;
	private static BiConsumer<Integer, Integer> bipassMethod(BiConsumer<Integer, Integer> consumer) {
		 
		return (f,s)->{ 
		try{
			consumer.accept(f, s);
		}catch(ArithmeticException ae){
			System.out.println(ae);
		}
		 
	};
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

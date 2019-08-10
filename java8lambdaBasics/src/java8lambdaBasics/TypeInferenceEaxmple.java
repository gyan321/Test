package java8lambdaBasics;

public class TypeInferenceEaxmple {
	
	 public static void main(String []args){
		
		 
		 // passing lambda expression to an in line variable.
		 StringLengthLambda length=(String s)->s.length();
		 System.out.println(length.getLength("shdjakdja"));
		 
		 
		 //passing lambda expression directly as an argument to a method 
		 lengthString((String s)->s.length());
		 
	 } 
	 
	 
	
	 public static void lengthString(StringLengthLambda lambdaExpression){
		 System.out.println(lambdaExpression.getLength("sadadadadasda"));
	 }
	 
	 
	 
	 
	interface StringLengthLambda{
		
		int getLength(String s);
	}	

}





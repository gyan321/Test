package com.derivates.duplicateWord;

import java.util.Scanner;

public class UseOfTryCatch {

	/**
	 * @ using try catch to handle exception
	 */
	public static void main(String[] args) {
	 
		System.out.println("program using try catch for Arithmetic exception");
		
		/**
		 * @ entering runtime value
		 */
		Scanner scanObject=new Scanner(System.in);
		
		 System.out.print("enter your number::");
		 int eneterValue=scanObject.nextInt();
		 
		 try{
			 int result=eneterValue/0;
		 }
		 catch(ArithmeticException exception){
			 System.out.println("Any number divided by zero is undefined");
			 
			 
		 }
		  
		 
		
		 
		

	}

}

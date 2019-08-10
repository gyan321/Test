package com.derivates.duplicateWord;

import java.util.Scanner;

public class UseOfThrow {

	public static void main(String[] args) {
		@SuppressWarnings("resource") 
		Scanner scanObject= new Scanner(System.in);
		System.out.println("enter your age ");
		
		int age= scanObject.nextInt();
		
		if(age<20){
			throw new TooYoungException("U are too young for  marriage");
		}
		
		else if(age>50)
		{	
			throw new TooOldException("U are too old to get married");
		}
		else
		{
			System.out.println("u are eligible for marriage");
		}
		

	}

}

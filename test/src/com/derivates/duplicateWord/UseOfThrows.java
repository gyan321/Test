package com.derivates.duplicateWord;

public class UseOfThrows
{
	
	public void checkThrow() throws ArithmeticException{
		throw new ArithmeticException(" OUR ARITHMETIC EXCEPTION OCCURED");
	}

	public static void main(String[] args)  
	
	{
		UseOfThrows object=new UseOfThrows();
		object.checkThrow();
		
		System.out.println("end of the program");
	}

}

package wordsCount;

import java.util.StringTokenizer;

public class CountingNoOfWords2
		{ 
			public static void main(String args[])
			{ 
				
				 int count=1;
				String enteredString = " I am practicing logical program  ";
				enteredString=enteredString.trim();
		 
				 StringTokenizer givenStirng=new StringTokenizer(enteredString);
				 
				 while(givenStirng.hasMoreTokens()){
					 System.out.println(givenStirng.nextToken()+" :"+count);
					 count++;
				 }
				 System.out.println("\ntotal words :"+count);
		 
			}

	}

 

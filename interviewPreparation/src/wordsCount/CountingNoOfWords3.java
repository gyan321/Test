package wordsCount; 

public class CountingNoOfWords3
		{ 
			public static void main(String args[])
			{ 
				
				 int count=1;
				String enteredString = " I am practicing logical program  ";
				
				enteredString=enteredString.trim();
		 
				  String [] stringArray=enteredString.split("\\s");
				 
				 for(String eachWord:stringArray){
					 count++;
				 }
				 System.out.println("\ntotal words :"+count);
		 
			}

	}

 

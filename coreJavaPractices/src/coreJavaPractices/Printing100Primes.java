package coreJavaPractices;

public class Printing100Primes {

	public static void main(String[] args) {

		 
		int count = 0;
		int c=0;

		for(int i = 2; i > 1; i++) { 
			
			 for (int j = 1; j <= i; j++) {
				 
			      if (i % j == 0) {
			         c++;
			      }
			      
			      if (c == 2) {
					  System.out.println(i);
						count++;
						 
						
				  }
			     
			  } 
			 
			
			if(count==100){
				System.out.println(count);
				break;
			}

		}

	}

}

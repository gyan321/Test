package primeCheck;

import java.util.Scanner;

public class CheckingPrime {
	
static short count=0;

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("eneter any number :");
		 int givenNumber=sc.nextInt();
		 
		 for(int i=2;i<givenNumber/2;i++){
			 
			 if(givenNumber%2==0){
				 count++;
			 }
			
		 }
		 if(count>1){
			 System.out.println(" it is not APRIME NUMBER");
		 }
		 else{
			 System.out.println(" it is   A PRIME NUMBER");
		 }
	}

}

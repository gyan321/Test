package perfectnumber_check;

import java.util.Scanner;

public class CheckPerfectNumber {
	
	int remainder;
	static int  sum=0; 

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanObject=new Scanner(System.in);
		System.out.println("enter any value: ");
		
		int enteredNumber=scanObject.nextInt();
		
		for(int indexValue=1;indexValue<(enteredNumber-1);indexValue++){
			
			if(enteredNumber%indexValue==0){
				sum=sum+indexValue;
				
			} 
			
		}
		if(sum==enteredNumber)
		{
			System.out.println(enteredNumber+" : is a perfect number");
		}
		else
		{
			System.out.println(enteredNumber+" : is not a perfect number");
		}
		 

	}

}

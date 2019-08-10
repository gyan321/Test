package Palindrome;

import java.util.Scanner;

public class CheckingPalindrome {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.print("eneter any String :");
		 
		 String givenString=sc.nextLine();
		 
		 char []reverse=new char[givenString.length()];
		 
		 char []StringChar= givenString.toCharArray();
		 
		 for(int i=StringChar.length-1,k=0;i>=0 ;i--){
			 
			 reverse[k++]=StringChar[i];
		 }
		 
		 for(char each:reverse){
			 System.out.print(each+",");
		 }
		 
		 String StringReverse=new String(reverse);
		 
		 if(StringReverse.equalsIgnoreCase(givenString)){
			 System.out.println("palindrome");
		 }
		 else{
			 System.out.println("not a palindrome");
		 }
		 
		 
		 
	 
	}

}

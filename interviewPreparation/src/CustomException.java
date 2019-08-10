import java.util.Scanner;

public class CustomException {

	public static void main(String[] args)   {
		 Scanner userObject =new Scanner(System.in);
		 System.out.print("enter age :");
		 int enteredAge=userObject.nextInt();
		 
		 if(enteredAge<20){
			 throw new TooYoungException("you are not eligible for the marriage,too young");
		 }
		 
		 if(enteredAge>60){
			 throw new TooOldException("you are not eligible for the marriage,too old");
		 }
		 
		 System.out.println();

		 

	}

}

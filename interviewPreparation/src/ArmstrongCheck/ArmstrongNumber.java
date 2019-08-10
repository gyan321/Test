package ArmstrongCheck;

import java.util.Scanner;

public class ArmstrongNumber {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		int number = 153;
		int check, remainder, sum = 0;
		System.out.println("Enter the number to be verified:");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		check = number;
		while (check != 0) {
			remainder = check % 10;
			sum = sum + (remainder * remainder * remainder);
			check = check / 10;
		}
		if (sum == number)
			System.out.println("Given number is an armstrong number.");
		else
			System.out.println("Given number is not an armstrong number.");
	}
}
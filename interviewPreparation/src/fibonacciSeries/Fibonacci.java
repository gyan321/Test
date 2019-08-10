package fibonacciSeries;

import java.util.Scanner;

class Fibonacci {
	public static void main(String[] args) {
		
		int i, eneterNumber, first = 0, second = 1, next;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number for Series: ");
		eneterNumber = sc.nextInt();
		first = 0;
		second = 1;
		System.out.println("Fibonacci series are: ");
		for (i = 0; i < eneterNumber; i++) {
			System.out.println(first);
			next = first + second;
			first = second;
			second = next;
		}
	}
}
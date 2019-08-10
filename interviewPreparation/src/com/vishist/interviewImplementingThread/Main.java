package com.vishist.interviewImplementingThread;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		A aObject = new A();
		aObject.start();

		B bObject = new B();
		bObject.start();

		for (int j = 22; j < 32; j++) {
			System.out.println("Main class:" + j);
		}
		long end = System.currentTimeMillis();
		
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.println("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");

	}

}

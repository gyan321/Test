package com.vishist.interviewImplementingRunnable;

public class A implements Runnable{

	@Override
	public void run() {
		 System.out.println(System.currentTimeMillis()); 
		for (int i = 0; i < 10000; i++) {
			System.out.println("child Thread:A" + i);

		}
		 System.out.println("child:::"+System.currentTimeMillis()); 
		
	}
	
	
	

}

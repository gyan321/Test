package com.vishist.interviewImplementingThread;

public class B extends Thread {
	
	public void run() {
		for (int i =100001; i < 200000; i++) {
			System.out.println("child Thread B:" + i);

		}
	}

}

package com.vishist.interviewImplementingThread;

public class A extends Thread {

	public void run() {
		for (int i = 0; i < 100000; i++) {
			System.out.println("child Thread:A" + i);

		}
	}

}

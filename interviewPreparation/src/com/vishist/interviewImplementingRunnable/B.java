package com.vishist.interviewImplementingRunnable;

public class B  implements Runnable{

	@Override
	public void run() {
		for (int i =1001; i < 2000; i++) {
			System.out.println("child Thread B:" + i);

		}
		}

}

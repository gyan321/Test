package com.vishist.interviewImplementingRunnable;

public class Main {

	public static void main(String[] args) {
		
		 
		 System.out.println(System.currentTimeMillis()); 
		 
		 A myRunnableAObject=new A();
		
		//B myRunnableBObject=new B();
		
		Thread tA=new Thread(myRunnableAObject);
		
		tA.start();
		
       /* Thread tB=new Thread(myRunnableBObject);
		
		tB.start();
		*/
		
		 for(int j=22;j<32;j++){
			 System.out.println("Main class:"+j);
		 }
		 
		 System.out.println("main::::"+System.currentTimeMillis()); 
	 
			
		 
	}
	

}

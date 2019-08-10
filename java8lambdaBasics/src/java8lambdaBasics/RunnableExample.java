package java8lambdaBasics;

public class RunnableExample {

	public static void main(String[] args) {
		 
		Thread myThread=new Thread (new Runnable() {
			
			@Override
			public void run() {
				 System.out.println("this is from inside the runnable interface");
				
			}
		});
		 
		myThread.run();
		
		Thread myLamdbaThread= new Thread(()-> System.out.println("this is from inside the 2nd runnable interface"));
		
		myLamdbaThread.run();

	} 

}

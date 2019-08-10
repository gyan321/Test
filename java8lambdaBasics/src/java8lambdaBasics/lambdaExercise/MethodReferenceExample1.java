package java8lambdaBasics.lambdaExercise;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		 
		
		Thread myThread=new Thread(MethodReferenceExample1::printMessage);//this type:  ()->method()
		
		myThread.start();
		
		
	}
	
	public static void printMessage(){
		System.out.println("hello");
	}
}
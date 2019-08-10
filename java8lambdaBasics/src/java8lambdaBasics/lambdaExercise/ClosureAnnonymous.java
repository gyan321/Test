package java8lambdaBasics.lambdaExercise;

public class ClosureAnnonymous {

	public static void main(String[] args) {
		 
		int x=10;
		int y=20;
		operation(x,new ClosureInterface(){

			@Override
			public void operate(int i) {
				 System.out.println(i+y);
				
			} 
			
		} );

	}
	
	public static void  operation(int i,ClosureInterface co){
		
		co.operate(i);
	}

}

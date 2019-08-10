package java8lambdaBasics.lambdaExercise;

public class ClosureLambda {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		operation(x,(i)->System.out.println(i+y));

	}
	
	public static void  operation(int x,ClosureInterface co){
		
		co.operate(x);
	}

	}

 

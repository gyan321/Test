package java8lambdaBasics.lambdaExercise;

public class ThisReferenceJava8LambdaWay {
	
	public void doProcess(int i,ClosureInterface ClosureInterfaceObject){
		ClosureInterfaceObject.operate(i);
	}
	

	public static void main(String[] args) {
		
		
		ThisReferenceJava8LambdaWay ThisReferenceJava8LambdaObject=new ThisReferenceJava8LambdaWay();
		ThisReferenceJava8LambdaObject.doProcess(10, (i)->
		{
		System.out.println(i);
		System.out.println(this);
		});
	}

}

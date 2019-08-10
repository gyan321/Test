package java8lambdaBasics.lambdaExercise;

public class ThisReferenceJava8LambdaWayNonStaticMethod {
	public void doProcess(int i,ClosureInterface ClosureInterfaceObject){
		ClosureInterfaceObject.operate(i);
	}
	
	
	
@Override
	public String toString() {
		return " this is main class tostirng";
	}



public void execute(){
	doProcess(10, (i)->
	{
	System.out.println(i);
	System.out.println(this);
	}  );
	
	
	}


	public static void main(String[] args) {
		
		
		ThisReferenceJava8LambdaWayNonStaticMethod ThisReferenceJava8LambdaObject=new ThisReferenceJava8LambdaWayNonStaticMethod();
		ThisReferenceJava8LambdaObject.execute();
	}

}

package java8lambdaBasics;

public class Greeter {
	
	public void greet(Greeting greet){
		greet.perform();
		
	}

	public static void main(String[] args) {
		
		Greeter greeterObject=new Greeter();
		
		HelloWorldGreeting helloWorldGreetingOject=new HelloWorldGreeting();
		
		HelloWorldGreeting2 helloWorldGreetingOject2=new HelloWorldGreeting2();
		
		//greeterObject.greet(helloWorldGreetingOject2);
		
		/*
		 * 1. here we are passing in a behavior not object
		 * 2. but here we are passing in a class object just to get that behavior from that class
		 * hence by oops approached :----
		 * 		1. first we need to create an object
		 * 		2. then using that object , we call that behavior.
		 * 
		 * PROBLEM WITH THIS APPROACHED:
		 * -------------------------------
		 * 1. we are doing extra work by creating object.
		 *  
		 * SOLUTION 
		 * ---------
		 * 1.by using lambda approach, we dont need to create the object.
		 * 2.simply provide the behavior as argument
		 * 		--> without creating object
		 * 		--> without defining that behavior to any class 
		 * 		--> without belonging to any class,they exits in isolation
		 * 		--> this behavior or function can also be treated as a value. 
		 * 
		 * 
		 * 
		 * */
		
		//this is anonymous inner class
		Greeting myGreet = new Greeting(){ 
			@Override
			public void perform() {
				System.out.println("heelo i  am  from anonymous inner class of that interface");
				
			}
		};
		
		myGreet.perform();
		
		
		//this is lambda expression.
		Greeting myObject = ()->System.out.println("hello world22 greeting now!! gyanchan");	 	
		myObject.perform();
		 	 
		greeterObject.greet(myObject);
		
		 
		

	}

}

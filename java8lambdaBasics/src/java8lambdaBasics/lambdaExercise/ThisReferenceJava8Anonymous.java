package java8lambdaBasics.lambdaExercise;

public class ThisReferenceJava8Anonymous {

	private void doProcess(int i, ClosureInterface ClosureInterface) {
		ClosureInterface.operate(i);

	}

	public static void main(String[] args) {

		ThisReferenceJava8Anonymous thisReferenceJavaObject = new ThisReferenceJava8Anonymous();
		thisReferenceJavaObject.doProcess(10, new ClosureInterface() {

			@Override
			public void operate(int i) {

				System.out.println("inside the anonymous class" + i);
				System.out.println(this);
			}

			public String toString() {
				return "anonymous class to string";
			}

		});
	}

}

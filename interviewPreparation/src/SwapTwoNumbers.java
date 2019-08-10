
public class SwapTwoNumbers {

	public static void main(String[] args) {
		 
		byte a=10,b=20;
		a=(byte) (a+b);
		b=(byte) (a-b);
		a=(byte) (a-b);
		System.out.println("a="+a+"b="+b);

	}

}

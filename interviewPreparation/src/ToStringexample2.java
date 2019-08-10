import java.util.ArrayList;

public class ToStringexample2 {

	public static void main(String[] args) {
	 
		ArrayList<Integer> al= new ArrayList<>();	//collection
		
		al.add(11);
		al.add(12);
		al.add(13);
		
		System.out.println(al);
		
		
		String s =new String("gysnchandra");	//String
		System.out.println("from String class"+s);
		
		
		Integer i=new Integer(10);				//Wrapper classes
		System.out.println("from Wraper class"+i);

	}

}

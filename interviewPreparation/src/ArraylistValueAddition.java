import java.util.ArrayList;

public class ArraylistValueAddition {

	public static void main(String[] args) {
		 ArrayList<Integer> alObject=new ArrayList<>();
		 
		 for(int i=0;i<1000;i++){
			 alObject.add(i);
		 }
		 
		 for(Integer each:alObject){
			 System.out.println(each);
		 }
		 System.out.println("child:::"+System.currentTimeMillis()); 
	}

}

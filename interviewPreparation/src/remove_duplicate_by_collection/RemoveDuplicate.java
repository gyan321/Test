package remove_duplicate_by_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	 
	public static void main(String[] args) {
		int givenArray[] = { 1, 5, 1, 6, 7, 11 };
		
		//givenArray.forEach(eachValue->System.out.print(eachValue+","));
		System.out.println("before: ");
		for(int each:givenArray){
			System.out.print(each+",");
		}
		ArrayList<Integer> list = new ArrayList<>();

		 Arrays.asList(givenArray);
		
		
		System.out.println("\nafter");
		
		Set<Integer> setValues=new HashSet<>(list);
		
		 for(Integer each:setValues){
			 System.out.println(each);
		 }
		
	}

}

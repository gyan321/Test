package removingDuplicateFromArrayLIst;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		 
			List<Integer> values=new ArrayList<>();
			values.add(1);
			values.add(2);
			values.add(11);
			values.add(1);
			values.add(13);
			values.add(1);
			
			System.out.println("given list: ");
			values.forEach(eachValue->System.out.print(eachValue+","));
			
			System.out.println("\n\nwithout duplicate list: ");
			Set<Integer> setValues=new HashSet<>(values);
			setValues.forEach(eachValue->System.out.print(eachValue+","));
	}

}

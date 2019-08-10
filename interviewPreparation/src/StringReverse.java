
public class StringReverse {
	public static void main(String[] args) {
		 String givenString="this is my String";
		 
		 char [] mychar=givenString.toCharArray();
		 
		 String  reverseString="";

		for(int  i=mychar.length-1;i>0;i--){
			reverseString =reverseString+mychar[i];
		      
		}

 System.out.println(reverseString);

		 
		 

	}

}

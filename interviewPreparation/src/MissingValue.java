
public class MissingValue {
	
	
	int originalSum;
	int number;
	int arrayValues[]=new int[101],arraySum=0;
	
	public   void  OriginalAddition(int enteredValue){
		originalSum=(enteredValue*(enteredValue+1)/2); 
		 
	}
	
	public int missedValueCalculation(){
		
		
		for(int i=1;i<=100;i++){ 			
			
			if(i==10){
				arrayValues[i]=i+1;
				i++;				 
			} 
			arrayValues[i]=i;
			arraySum=arraySum+arrayValues[i];
			 
			System.out.print(arrayValues[i]+",");
			
		}  
		 
		 
		
		return originalSum-arraySum;
	}
	

	public static void main(String[] args) {
		
		String str = "geekss@for@geekss"; 
        String[] arrOfStr = str.split(" ");
        for(String each:arrOfStr){
        	System.out.println( each);
        }
        
        
		MissingValue missObject=new MissingValue();
		missObject.OriginalAddition(100);
		System.out.println("sum"+missObject.originalSum);
		
		System.out.println("\nmissed value:"+missObject.missedValueCalculation());

	}

}

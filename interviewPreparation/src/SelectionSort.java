
public class SelectionSort {
	
	 
	
	private static int[] sort(int[] givenArray) { 
		
		System.out.println();
		for(int i=0;i<givenArray.length;i++){
			int minimum=i;
			
			for(int j=i+1;j<givenArray.length;j++)
			{
				
				if(givenArray[j]<givenArray[minimum]){
					minimum=j;
				}
				
			}
			int temp=givenArray[i];
			givenArray[i]=givenArray[minimum];
			givenArray[minimum]=temp;
			
			
		}
		
		return givenArray;
	}
	

	public static void main(String[] args) {
		 
        int [] givenArr=sort(new int[] {32,77,1,8,39});
		
		for(int i=0;i<givenArr.length;i++){
			System.out.print(" "+givenArr[i]);
		}
		 

	} 

}

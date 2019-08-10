
public class LinearSearch {
	
 
	

	public static void main(String[] args) {
		 
		int [] arr={15,9,7,13,12,16,4,18,11}; 
		
		int key=12;
		
		for(int i=0;i<arr.length;i++){
			
			if(key==arr[i]){
				System.out.println("at index:"+i);
				
				break;
			}
		}
	}

}

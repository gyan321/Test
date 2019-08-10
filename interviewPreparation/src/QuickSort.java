 
public class QuickSort {

	public static void main(String[] args) { 
		
		int [] givenArray={15,9,7,13,12,16,4,18,11};
		
		int leng=givenArray.length;
		
		QuickSort qsm=new QuickSort();
		qsm.quickSortRecursion(givenArray, 0, leng-1);
		qsm.printArray(givenArray);
		
	}
	
	int partition(int[] arr,int low,int high)
	{
		int pivot=arr[low];
		
		while(low<=high){
			
			
			while(arr[low]<pivot){
				low++;
			}
			
			while(arr[high]>pivot){
				high--;
			}
			
			if(low<=high){
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				
				low++;
				high--;
			}
		}
		
		
		return low;
	}
	
	void quickSortRecursion(int[] arr,int low,int high)
	{
		int pi=partition(arr,low,high);
		if(low<pi-1){
			quickSortRecursion(arr,low,pi-1);
		}
		if(pi<high){
			quickSortRecursion(arr,pi,high);
		}
	}
	 
	
	void printArray(int[] arr){
		for(int eachValue:arr){
			System.out.print(eachValue+" ");
		}
	}
	
	
	
	
	
	
	

}

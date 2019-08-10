package com.vishist.interviewInsertConcurrentModificationException;

 
 
/*	import java.util.concurrent.CopyOnWriteArrayList;

	public class ConcurrentListExample {

	    public static void main(String[] args) {
	       // List<Integer> list = new ArrayList<>();
	       
	    	CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>();
	        for(int i=1;i<=1000;i++){
	        	list.add(i); 
	        }
	        
	        System.out.println(list);
	        
	        list.remove(11);
	        
	        System.out.println(list);
	        	 
	        
	        }
	        
	        
	         
	     
} */
	
	 import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.List;
	import java.util.concurrent.CopyOnWriteArrayList;

	public class ConcurrentListExample {

	    public static void main(String[] args) {
	       // List<Integer> list = new ArrayList<>();
	       
	    	 List<Integer> list = new ArrayList<>();
	        for(int i=1;i<=1000;i++){
	        	list.add(i); 
	        }
	        
	        System.out.println(list);
	        
	        for(int each:list){
	        	 
	        	
	        	//System.out.println(each);
	        	list.remove(each);
	        
	        }
	        
	        
	         
	     
}
} 
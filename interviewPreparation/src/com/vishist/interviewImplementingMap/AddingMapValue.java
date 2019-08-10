package com.vishist.interviewImplementingMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class AddingMapValue {

	public static void main(String[] args) {
		 
		HashMap<Integer,String> mapObject=new   HashMap<>();
		
		mapObject.put(1,"java");
		mapObject.put(2,"C");
		mapObject.put(3,"java");
		mapObject.put(4,"python");
		mapObject.put(1,"angular");
		//mapObject.put(1,"java");
		
		
		System.out.println(mapObject);
		
		System.out.println("getting only value for a key::"+mapObject.get(2));
		System.out.println("getting only value for a key::"+mapObject.get(2));
		 System.out.println("The set is: " + mapObject.keySet()); 
		 
		 System.out.println("checking value existed or not:::"+mapObject.containsValue("angular"));
		 
		 /*if(mapObject.containsValue("angular")){
			 System.out.println("key:::"+mapObject.getKey());
		 }*/
		 
		 for(Entry<Integer,String> entrySet:mapObject.entrySet()){
			 
			 if(entrySet.getValue().equals("java")){
				 
				 System.out.println("corresponding key:: "+entrySet.getKey());
			 }
			 
		 }
		

	}

}

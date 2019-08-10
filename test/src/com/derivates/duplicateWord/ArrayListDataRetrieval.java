package com.derivates.duplicateWord;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDataRetrieval {

	public static void main(String[] args) {
		 ArrayList<Integer> alObject=new ArrayList<>();
		 alObject.add(23);
		 alObject.add(111);
		 alObject.add(2322);
		 alObject.add(244);
		 
		 System.out.println("the arraylist values::");
		 
		 for(Integer each:alObject){
			 System.out.print(each +" ,");
		 }
		 
		 
		 LinkedList<Integer> alObjec=new LinkedList<>();
		 alObjec.add(23);
		 alObjec.add(111);
		 alObjec.add(2322);
		 alObjec.add(244);
		 
		 System.out.println("\n the LinkedList values::");
		 
		 for(Integer each:alObjec){
			 System.out.print(each +" ,");
		 }
	}

}

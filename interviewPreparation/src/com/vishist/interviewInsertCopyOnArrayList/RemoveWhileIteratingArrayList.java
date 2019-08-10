package com.vishist.interviewInsertCopyOnArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveWhileIteratingArrayList {

	public static void main(String[] args) {
		 
        // creating ArrayList of type String
        ArrayList<String> cowalStars = new ArrayList<>();
 
        // adding elements to ArrayList
        cowalStars.add("Super Star");
        cowalStars.add("Ultimate Star");
        cowalStars.add("Rock Star");
        cowalStars.add("Little Star");
 
        System.out.println("Iterating using enhanced for-loop:\n");
 
        // iterating ArrayList using enhanced for-loop
        for(String star : cowalStars) {
            System.out.println(star);
        }
        System.out.println("\n1st: Iteration of AL completed... !!\n\n");
 
        System.out.println("\n\n2nd: Iterating & removing:\n");
 
        // iterating ArrayList using Iterator
        Iterator<String> itr = cowalStars.iterator();
        while(itr.hasNext()){
 
            String star = itr.next();
 
            if(star.contains("Super")){
                itr.remove();
            }
            else{
                System.out.println(star);
            }
        }
    }
}

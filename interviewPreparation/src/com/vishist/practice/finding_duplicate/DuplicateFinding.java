package com.vishist.practice.finding_duplicate; 

public class DuplicateFinding {

	int i, j,count=0;

	public void removeDuplicate(int[] passedArray, int arraySize) {

		 
		for (i = 0; i < arraySize - 1; i++) {

			for (j = i + 1; j < arraySize; j++) {

				if (passedArray[i]== passedArray[j]) {

					 System.out.println("duplicate are :"+passedArray[i]);
				} 
			} 
		}

	}

	public static void main(String[] args) {

		int givenArray[] = { 1, 5, 1, 6, 7, 11 };
		int arraySize = givenArray.length;
		DuplicateFinding duplicateObject = new DuplicateFinding();

		duplicateObject.removeDuplicate(givenArray, arraySize);

	}

}

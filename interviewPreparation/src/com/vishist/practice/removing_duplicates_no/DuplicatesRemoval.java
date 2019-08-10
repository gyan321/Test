package com.vishist.practice.removing_duplicates_no;

public class DuplicatesRemoval {

	int i, j, k;

	public void removeDuplicate(int[] passedArray, int arraySize) {

		int requiredArray[] = new int[arraySize];

		for (i = 0; i < arraySize - 1; i++) {

			for (j = i + 1, k = i; j < arraySize; j++) {

				if (passedArray[i]!= passedArray[j]) {

					requiredArray[k] = passedArray[i];
					k++;
				}

				if ((i == arraySize - 2) && (passedArray[arraySize - 2] != passedArray[arraySize - 1])) {
					requiredArray[k] = passedArray[j];
				}

			}
			System.out.print(requiredArray[k] + ",");

		}

	}

	public static void main(String[] args) {

		int givenArray[] = { 1, 5, 1, 6, 7, 11 };
		int arraySize = givenArray.length;
		DuplicatesRemoval duplicateObject = new DuplicatesRemoval();

		duplicateObject.removeDuplicate(givenArray, arraySize);

	}

}

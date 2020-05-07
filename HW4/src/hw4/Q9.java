package hw4;

import java.util.Arrays;

public class Q9 {

	public static void main(String[] args) {
		// initializing unsorted array
		Object arr[] = { 10, 2, 22, 69 };

		// Array must be sorted before binary search is used.
		Arrays.sort(arr);

		// entering the value to be searched
		int searchVal = 2;

		int retVal = Arrays.binarySearch(arr, searchVal);
		System.out.println("The index of element 2 is : " + retVal);

	}

}

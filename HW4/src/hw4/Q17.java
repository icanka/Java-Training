package hw4;

import java.util.Arrays;

public class Q17 {

	public static void main(String[] args) {
		String[] os = new String[] { "Mac", "Linux", "Windows"};
		
		// Sorts the array alphabetically
		Arrays.sort(os);
		
		// Find and print the index of the given key. Which happens to be 1.
		System.out.println(Arrays.binarySearch(os, "Mac"));
		
		// Sorted array, "Mac" is the second element in the sorted array.
		for(String element: os) {
			System.out.print(element + ", ");
		}
		
	}

}

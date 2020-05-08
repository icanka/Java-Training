package hw4;

import java.util.Arrays;

public class Q47 {

	public static void main(String[] args) {
		// This array is already sorted. We don't need to sort it
		// before searching with binary search.
		String[] os = new String[] { "Linux", "Mac", "Windows" };
		System.out.println(Arrays.binarySearch(os, "Linux"));
	}	
}	

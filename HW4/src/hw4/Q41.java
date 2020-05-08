package hw4;

import java.util.Arrays;

public class Q41 {

	public static void main(String[] args) {
		String[] os = new String[] { "Mac", "Linux", "Windows" };

		/*
		 * We get the correct result with this example but this behavior is not
		 * guaranteed the binary search runs with the assumption that the array is
		 * already sorted, so with an unsorted array the result is undefined.
		 */
		System.out.println(Arrays.binarySearch(os, "Linux"));
	}

}

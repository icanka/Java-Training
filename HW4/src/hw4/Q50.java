package hw4;

import java.util.Arrays;

public class Q50 {

	public static void main(String[] args) {
		Arrays.sort(args);
		// Type mismatch error since we are trying to assign ant int primitive
		// to a String object.
		String result = Arrays.binarySearch(args, args[0]);

		/*
		 * We should also note that this code is meaningless aside from the type
		 * mismatch compilation error because we are using the first element of the
		 * already sorted array and using it as the key in binary search. The result is
		 * always going to be 0.
		 * 
		 * Also this code is prune to ArrayIndexOutOfBoundsException, given there are no
		 * arguments.
		 */
		 

	}

}

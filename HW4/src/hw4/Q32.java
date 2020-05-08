package hw4;

import java.util.Arrays;

public class Q32 {
	public static void main(String[] args) {
		
		String[] args2 = {"seed", "flower"};
		args = args2;
		String one = args[0];
		Arrays.sort(args);
		
		// Searches for the first given parameter in the sorted array.
		int result =  Arrays.binarySearch(args, one);
		System.out.println(result);
		
	}
}

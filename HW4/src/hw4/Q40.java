package hw4;

import java.util.Arrays;

public class Q40 {

	public static void main(String... args) {
		// Sorts the array
		Arrays.sort(args);
		
		// Prints the array
		// But since there is no parameter given, it just
		// print "[]", an empty array.
		System.out.println(Arrays.toString(args));
		System.out.println(args.length);
		

	}

}

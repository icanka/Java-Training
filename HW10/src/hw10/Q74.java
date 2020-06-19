package hw10;

import java.util.Arrays;

public class Q74 {

	public static void main(String[] strings) {
		String[] args = { "EchoFirst", "seed", "flower", "plant" };
		Arrays.sort(args);

		// Returns 0, since we are searching the element at the index 0.
		int result = Arrays.binarySearch(args, args[0]);
		System.out.println(result);
	}

}

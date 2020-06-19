package hw10;

import java.util.Arrays;

public class Q63 {

	public static void main(String[] args) {
		String[] args1 = { "hello", "blabla", "armerkom" };

		int result = Arrays.binarySearch(args1, args1[0]);
		System.out.println(result);
	}

}

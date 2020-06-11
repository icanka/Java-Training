package hw9;

import java.util.Arrays;
import java.util.List;

public class Q21 {
	public static void main(String[] args) {

		// An array is initialized with an array literal
		String[] array = { "Natural History", "Science" };

		// Create a wrapper list object.
		List<String> museums = Arrays.asList(array);

		// Change the element at index 0 to "Art"
		museums.set(0, "Art");
		System.out.println(museums.contains("Art"));

	}
}

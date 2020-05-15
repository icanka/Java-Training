package hw5;

import java.util.Arrays;
import java.util.List;

public class Q12 {

	public static void main(String[] args) {

		// Creates and returns an list from the given array
		List<String> drinks = Arrays.asList("can", "cup");

		// Starts from the last index and iterates to the beginning, printing the
		// elements
		// inside the list.
		for (int container = drinks.size() - 1; container >= 0; container--)
			System.out.print(drinks.get(container) + ",");

	}

}

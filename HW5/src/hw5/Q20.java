package hw5;

import java.util.Arrays;
import java.util.List;

public class Q20 {

	public static void main(String[] args) {

		// Creates a list from an array.
		List<String> drinks = Arrays.asList("can", "cup");

		// Basically iterates through the list using container variable as index.
		for (int container = 0; container < drinks.size(); container++)
			System.out.println(drinks.get(container) + ", ");
	}

}

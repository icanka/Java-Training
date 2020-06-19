package hw10;

import java.util.Arrays;
import java.util.List;

public class Q51 {
	public static void main(String[] args) {
		List<String> drinks = Arrays.asList("can", "cup");

		for (int container = drinks.size(); container > 0; container++) {
			// drinks.get(1) --> first iteration
			// drinks.get(2) --> second iteration ----> Throws IndexOutOfBounds Exception
			System.out.print(drinks.get(container - 1) + ",");
		}
	}
}

package hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q46 {

	public static void main(String[] args) {

		// Left hand side of the ternary operator evaluates to true
		// and GO outside is printed.
		String[] weather = { "sunny" };
		System.out.println(weather[0] != null && weather[0].equals("sunny")
		// !false is alway true
				&& !false ? "Go Outside" : "Stay Inside");

		// Since first element is null left side of the ternary operator
		// return false hence "stay inside is printed."
		String[] weather2 = new String[1];
		System.out.println(weather2[0] != null && weather2[0].equals("sunny") && !false ? "Go Outside" : "Stay Inside");

		// throws indexOutOfBounds exception
		String[] weather3 = {};
		System.out.println(weather3[0] != null && weather3[0].equals("sunny") && !false ? "Go Outside" : "Stay Inside");

	}

}

package hw5;

import java.util.Arrays;
import java.util.List;

public class Q43 {

	public static void main(String[] args) {
		List<String> exams = Arrays.asList("OCA", "OCP");

		// Iterates the same list two times. Every for loop
		// will run two times making the total call to the
		// inner print statement four.
		for (String e1 : exams)
			for (String e2 : exams)
				System.out.println(e1 + " " + e2);

	}

}

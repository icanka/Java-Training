package hw10;

import java.util.Arrays;
import java.util.List;

public class Q45 {
	public static void main(String[] args) {
		List<String> exams = Arrays.asList("OCA", "OCP");

		// First
		for (String e1 : exams)
			for (String e2 : exams)
				System.out.print(e1 + " " + e2);
		System.out.println();
	}
}

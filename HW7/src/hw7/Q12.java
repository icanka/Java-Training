package hw7;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Q12 {

	public static void main(String[] args) {
		School school = new HighSchool();

		// Code compiles fine but we should note that the exception is not
		// handled, we should either encapsulate the
		// statement with try-catch block or declare the enclosing method
		// with throws keyword.
		System.out.println(school.getNumberOfStudentsPerClassroom());

	}

	private static class School {
		public int getNumberOfStudentsPerClassroom(String... students) throws IOException {
			return 3;
		}

		public int getNumberOfStudentsPerClassroom() throws IOException {
			return 9;
		}
	}

	// HighSchool class correctly overrides base class method with narrower
	// exception type.
	private static class HighSchool extends School {
		public int getNumberOfStudentsPerClassroom() throws FileNotFoundException {
			return 2;
		}
	}
}

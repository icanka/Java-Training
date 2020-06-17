package hw10;

public class Q11 {
	// A, B, C
	public static void main(String[] args) {
		String race = "";

		// Labels can be removed since we are not referring to them in any way.
		outer:

		// Outer loop can be removed to safely. Because we are performing
		// the operation inside the inner do-while, and the condition of
		// the outer loop does not affect the output since when the inner
		// loops condition returns false, outer loop condition will also,
		// always return false.
		do {

			// This inner loop can be removed since it is not referenced.
			inner:

			// Unwrapping the operation from the inner do-while would cause the
			// output to change since the condition in the while is different.
			// There would be 4 'x'`s added and printed instead of 5.
			do {
				race += "x";

				// Removing just the condition lines will cause a compilation problem
				// since it won't be a valid syntax then.
			} while (race.length() <= 4);
		} while (race.length() < 4);

		System.out.println(race);
	}

}

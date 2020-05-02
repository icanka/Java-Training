package hw3;

public class Q34 {

	public static void main(String[] data) {

		/*
		 * data.length >= 1 and data.length < 2 means that it will only evaluate true if
		 * the length of the array is exactly 1. We can have an array of String with
		 * length 1 and that element (actually one of the program arguments here) can be
		 * "sound" or "logic" and so expression inside if evaluates to true. If the
		 * element is not "sound" or "logic" nothing will be printed.
		 */

		if (data.length >= 1
				// Since this is a short-circuit operator below part
				// never gets evaluated if the left-hand side is false.
				// Although we're not null checking specifically,
				// given that the 'data' array is program arguments
				// nullPOinterException is not expected.
				&& (data[0].equals("sound") || data[0].equals("logic")) && data.length < 2) {
			System.out.print(data[0]);
		} else
			System.out.println("Nothing happened.");
	}

}

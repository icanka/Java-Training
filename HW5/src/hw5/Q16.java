package hw5;

public class Q16 {

	private static int count;
	private static String[] stops = new String[] { "Washington", "Monroe", "Jackson", "LaSalle" };

	public static void main(String[] args) {

		// This while loop traverses through array
		while (count < stops.length) {

			// Checks every array element's length. If its smaller than 8, exit the while
			// loop
			if (stops[count++].length() < 8) {
				break;
			}
		}

		System.out.println(count);

	}

}

package hw5;

public class Q38 {

	private static int count;
	private static String[] stops = new String[] { "Washington", "Monroe", "Jackson", "LaSalle" };

	public static void main(String[] args) {
		while (count < stops.length) {

			if (stops[count++].length() < 8) {
				// continue doesn't affect anything here since there
				// is no any other code that could have been skipped
				// with continue statement.
				continue;
			}
		}
		System.out.println(count);
	}

}

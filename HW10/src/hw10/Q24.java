package hw10;

public class Q24 {
	public static void main(String[] args) {
		String tie = null;

		// This code does not compile, because assignmen operator is used instead of
		// equality.
		while (tie = null) {
			tie = "shoelace";
			System.out.println(tie);
		}
	}
}

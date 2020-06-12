package hw9;

public class Q39 {
	public static void main(String[] args) {
		String happy = " :) - (: ";

		// trim removes all trailing and leading white spaces.
		String really = happy.trim();

		// Don't take white spaces.
		String question = happy.substring(1, happy.length() - 1);
		System.out.println(really.equals(question));

	}
}

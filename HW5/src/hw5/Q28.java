package hw5;

public class Q28 {

	public static void main(String[] args) {
		String letters = "";

		// This boolean expression will never evaluate to false
		// since letters variable is concatenated with two character
		// strings every time
		while (letters.length() != 3)
			letters += "ab";
		System.out.println(letters);
	}

}

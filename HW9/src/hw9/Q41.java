package hw9;

public class Q41 {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("54312");

		// The substring 312 is not assigned to any variable
		// No change reflected to builder object.
		builder.substring(2);

		// Basically prints the character at index 1, which is 4.
		System.out.println(builder.charAt(1));
	}
}

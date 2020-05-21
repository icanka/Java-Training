package hw6;

public class Q41 {
	public static void call(int count, String me, String... strings) {

	}

	public static void main(String... args) {
		// third arguments counts as variable argument.
		call(2, "home", "sweet");

		call(5);
		call(9, "me", 10, "Al");
		call("answering", "service");
	}

}

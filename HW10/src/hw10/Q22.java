package hw10;

public class Q22 {
	public static void main(String[] args) {
		String witch = "b";
		String tail = "lack";

		// String are immutable, this returns a fresh copy but does not
		// assign it to witch, hence the witch is not changed.
		witch.concat(tail);
		System.out.println(witch);
	}
}

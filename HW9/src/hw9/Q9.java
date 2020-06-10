package hw9;

public class Q9 {
	public static void main(String... strings) {
		StringBuilder b = new StringBuilder("12");

		// "3" appended to the StringBuilder
		b = b.append("3");

		// Character set is reversed.
		b.reverse();
		System.out.println(b.toString());
	}
}

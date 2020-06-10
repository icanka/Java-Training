package hw9;

public class Q15 {
	public static void main(String... strings) {
		String b = "12";
		b += "3";
		// b is now "123"
		// reverse() is a StringBuilder method, not a String method.
		b.reverse();
		System.out.println(b.toString());
	}
}

package hw10;

public class Q1 {
	public static void main(String...books) {
		StringBuilder sb = new StringBuilder();
		// sb is an empty builder, due to that fact
		// the very first iteration throws a runtime exception
		// of String IndexOutOdBOundsException.
		System.out.println(sb.indexOf("c"));
		for(String book : books) {
			//System.out.println(book);
			sb.insert(sb.indexOf("c"), book);
		}
		System.out.println(sb);
	}
}

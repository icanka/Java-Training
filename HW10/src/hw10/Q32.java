package hw10;

public class Q32 {
	public static void main(String... strings) {
		StringBuilder sb = new StringBuilder();

		sb.append("red");
		// the 'r' character is deleted
		sb.deleteCharAt(0);

		// This will not delete any character practically.
		sb.delete(1, 1);

		System.out.println(sb);
	}
}

package hw9;

public class Q33 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("red");
		System.out.println(sb);
		String a = "adsf";
		// Deletes the character at index 0
		sb.deleteCharAt(0);
		System.out.println(sb);
		// Deletes the caharacters starting from index 1 which is 'd'.
		sb.delete(1, 2);
		System.out.println(sb);

	}

}

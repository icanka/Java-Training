package hw9;

public class Q20 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("radical");
		// sb is "radicalrobots", because inserts "robots" with replacing the
		// space character residing at the end of the character sequence.
		sb = new StringBuilder("radical ").insert(7, "robots");
		System.out.println(sb);
		System.out.println(sb.length());
	}

}

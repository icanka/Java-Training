package hw3;

public class Q17 {

	public static void main(String[] args) {

		int tiger = 2;
		short lion = 3;
		// Tiger and lion added first because
		// order of precedence is overridden by 
		// parentheses.
		long winner = lion + 2 * (tiger + lion);
		System.out.print(winner);

	}

}

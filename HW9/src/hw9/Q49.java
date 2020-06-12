package hw9;

public class Q49 {

	public static void main(String[] args) {

		// witch reference type variable is declared as type String
		// but initialized with a char literal.
		String witch = 'b';
		String tail = "lack";
		witch = witch.concat(tail);
		System.out.println(witch);
	}

}

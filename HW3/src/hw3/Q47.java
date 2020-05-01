package hw3;

public class Q47 {

	public static void main(String[] args) {
		/*
		 * Logical complement operator cannot be applied to numeric values. If we omit
		 * it expression evaluates to 34. Because of the parentheses 8+2 gets evaluated
		 * first before 8 is multiplied by three. Multiplication and modulus have the
		 * same precedence, it gets the form 5 + 10 *3 - 3 % 2 then 5 + 30 - 1, which is
		 * 34.
		 */
		int x = (5 + (!2 + 8) * 3 - 3 % 2);
		System.out.println(x);
	}

}

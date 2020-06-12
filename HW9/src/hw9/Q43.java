package hw9;

public class Q43 {
	// The argument type must be StringBuilder which has all the invoked methods.
	public static void secret(StringBuilder mystery) {
		char ch = mystery.charAt(3);
		mystery = mystery.insert(1, "more");
		int num = mystery.length();
	}
}

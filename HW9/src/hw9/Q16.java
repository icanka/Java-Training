package hw9;

import java.util.function.Predicate;

public class Q16 {

	public static void main(String[] args) {
		Predicate<String> pred1 = s -> false;
		Predicate<String> pred2 = (s) -> false;
		
		// parameter when used with type, must be wrapped around parentheses.
		Predicate<String> pred3 = String s -> false;
		Predicate<Strging> pred4 = (String s) -> false;

	}

}

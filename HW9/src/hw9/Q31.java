package hw9;

import java.util.function.Predicate;

public class Q31 {
	public static void main(String[] args) {
		Predicate<Integer> ip = i -> i != 0;
		// If we wrap the code in curly braces, we need to explicitly return
		// and we should also explicitly terminate the statement with semicolon,
		// as shown below.
		Predicate<Integer> ip2 = i -> {return i != 0;};
	}
}

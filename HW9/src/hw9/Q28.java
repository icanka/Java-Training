package hw9;

import java.util.function.Predicate;

public class Q28 {

	public static void main(String[] args) {

		// Predicate is a raw type here because no type parameter is given.
		Predicate dash = c -> c.startsWith("-");
		System.out.println(dash.test("-"));

	}
}

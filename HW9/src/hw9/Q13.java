package hw9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Q13 {

	public static void main(String... strings) {

		// Predicate 's a functional interface whose functional method is test(Object)
		Predicate<StringBuilder> p = (StringBuilder b) -> {
			return true;
		};

		// We can omit the curly braces, and get rid of the return. But if we use
		// braces.
		// the standard syntax rules applies. Without curly braces, lambdas have their
		// special, allowed syntax as given below. We do not have to use keyword return
		// for
		// example, Java can infer it.
		Predicate<StringBuilder> pr = (StringBuilder f) -> true;
	}

}

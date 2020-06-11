package hw9;

import java.util.function.Predicate;

public class Q26 {
	public static void main(String[] args) {
		// Predicate interface has a one method
		// boolean test(T t). It has one argument of type T
		// and since we give String as a type parameter
		// parameter type should be String in the lambda expression
		// and the lambda should return a boolean.
		Predicate<String> pred = (String a) -> true;
	}
}

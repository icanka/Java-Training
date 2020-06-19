package hw10;

import java.time.LocalTime;

public class Q49 {
	// The static keyword was missing, but for the sake of some thinking we added
	// it.
	// Otherwise this program has no entry point to begin with.
	public static void main(String[] args) {
		// Two different objects are created with new keyword, hence false.
		System.out.println(new StringBuilder("zelda") == new StringBuilder("zelda"));

		// Obviously returns true
		System.out.println(3 == 3);

		// True because literal were interned.
		System.out.println("bart" == "bart");
		// new keyword always creates new objects, hence false.
		System.out.println(new int[0] == new int[0]);

		// LocalTime.now() return a new coppy reference and also, a Little time
		// passes between the execution of left-hand side LocalTime.now() and the
		// right-hand side LocalTime.now(), hence false
		System.out.println(LocalTime.now() == LocalTime.now());
	}
}

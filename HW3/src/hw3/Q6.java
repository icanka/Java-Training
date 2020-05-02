package hw3;

public class Q6 {

	public static void main(String[] args) {
		// Ternary returns 3
		long thatNumber = 5 >= 5 ? 1 + 2 : 1 * 1;

		// Pre-increment increase the value before
		// so if evaluates to false.
		if (++thatNumber < 4)
			thatNumber += 1;
		System.out.print(thatNumber);

	}

}

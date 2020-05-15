package hw5;

public class Q36 {

	public static void main(String[] args) {
		String tie = null;

		// tie is null so the expression is true
		while (tie == null)
			// tie is assigned to a non-null value
			// this block will not going to be executed again.
			tie = "shoelace";
		// Note this print statement is not in the while loop,
		// even though indented, because no brackets was used.
		System.out.println(tie);

	}

}

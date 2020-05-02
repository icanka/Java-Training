package hw3;

public class Q12 {

	public static void main(String[] info) {
		int flair = 15;

		// Note that there are two distinct if statements

		// This is true so "Not enough" will be printed
		if (flair >= 15 && flair < 37) {
			System.out.print("Not enough");
		}

		// This does not evaluate to true but the else block gets
		// executed. "Too many" will be printed.
		if (flair == 37) {
			System.out.print("Just right");
		} else {
			System.out.print("Too many");
		}

	}

}

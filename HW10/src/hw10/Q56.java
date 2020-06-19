package hw10;

public class Q56 {
	private int space = 5;

	// Ternary operation evaluates to 10, since space is greater than 2.
	// int 10 is expanded to double and assigned to ship.
	private double ship = space < 2 ? 1 : 10; // g1

	public void printMessage() {
		// Note that there are two distinct if-then statements.

		// This will get executed since ship is greater than 1
		if (ship > 1) {
			System.out.println("Goodbye");
		}

		if (ship < 10 && space >= 2)
			System.out.println("Hello");

		// else block is going to be executed since ship is not less than 10
		else
			System.out.println("See you again");
	}

	public static void main(String... args) {
		Q56 instance = new Q56();
		instance.printMessage();
	}
}

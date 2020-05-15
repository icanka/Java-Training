package hw5;

public class Q27 {

	public static void main(String[] args) {
		Boolean balloonInflated = false;

		// This whole do-while statement is unnecessary since there is an if check in
		// place.
		do {

			// if-then block gets executed because variable is false.
			if (!balloonInflated) {
				balloonInflated = true;
				System.out.print("inflate-");
			}
		} while (!balloonInflated);
		System.out.println("done.");
	}

}

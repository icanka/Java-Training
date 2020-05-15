package hw5;

public class Q49 {

	public static void main(String[] args) {
		boolean baloonInflated = false;
		do {

			// Variable is going to be set to true
			if (!baloonInflated) {
				baloonInflated = true;
				System.out.print("inflate-");
			}

			// Since the variable is true, loop will go into an infinite loop.
		} while (baloonInflated);
		System.out.println("done");
	}

}

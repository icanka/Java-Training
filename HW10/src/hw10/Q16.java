package hw10;

public class Q16 {

	public static void main(String[] args) {
		String shoe1 = new String("sandal");
		String shoe2 = new String("flip flop");
		String shoe3 = new String("croc");

		// shoe1 and shoe2 points to same object. "sandal" is eligible for collection
		// now.
		shoe1 = shoe2;

		// shoe 2 and shoe3 points to same object now. Which is "croc".
		shoe2 = shoe3;

		// shoe1 and shoe3 points to " flip flop" now.
		shoe3 = shoe1;

		// shoe1, shoe3 --> "flip flop"
		// shoe2 --> "croc"

		// "sandal" is eligible for garbage collection.

	}

}

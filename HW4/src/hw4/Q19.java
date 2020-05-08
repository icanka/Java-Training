package hw4;

public class Q19 {

	public static void main(String[] args) {
		// Array itself is an object.
		Integer[] lotto = new Integer[4];
		// Note that all of the references in the array which is 4
		// points to null at the moment.
		
		// Two wrapper objects created and assigned as first
		// and second elements of the array.
		lotto[0] = new Integer(1_000_000);
		lotto[1] = new Integer(999_999);
		// Index 2 and 3 are still null.

	}

}

package hw3;

public class Q31 {

	public static void main(String[] args) {
		String bob = new String("bob");

		// Now notBob is also point to the same object in heap.
		String notBob = bob;
		// equals method checks the values inside the String rather than the String
		// itself.
		System.out.println((bob == notBob) + " " + (bob.equals(notBob)));

	}

}

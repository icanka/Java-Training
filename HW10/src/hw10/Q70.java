package hw10;

public class Q70 {

	public static void main(String[] args) {
		final Q70 h = new Q70();

		int length = 5;

		// Two elemnent list, both of them null.
		String[] type = new String[1];

		// Increased length is returned which is 6 and the first element of the array
		// is reassigned to "LONG"
		length = h.adjustPropellers(length, type);

		System.out.print(length + "," + type[0]);
	}

	public int adjustPropellers(int length, String[] type) {
		length++;
		type[0] = "LONG";
		return length;
	}

}

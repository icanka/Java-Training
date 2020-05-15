package hw5;

public class Q31 {

	public static void main(String[] args) {
		int k = 0;

		for (int i = 10; i > 0; i--) {

			// This while decrements i down to the '1' in the first for iteration
			while (i > 3)
				i -= 3;

			k += 1;
			// i is decremented by one after the first iteration and is now 0.
			// Hence the k variable is only incremented once.
		}

		System.out.println(k);
	}

}

package hw3;

public class Q41 {

	public static void main(String[] args) {

		// Since all the given parameter are not bigger than 5
		// they all return 0.
		System.out.print(CountEntries.getResult(5) + CountEntries.getResult(1) + CountEntries.getResult(0)
				+ CountEntries.getResult(2));
	}

	private static class CountEntries {
		public static int getResult(int threshold) {
			// Returns 0 if threshold is smaller than 5,
			// returns 1 otherwise
			return threshold > 5 ? 1 : 0;
		}
	}

}

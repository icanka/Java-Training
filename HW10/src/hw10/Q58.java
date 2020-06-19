package hw10;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Q58 {
	public static void main(String[] args) {
		try {
			final CarbonStructure ring = new Q58.Diamond();
			System.out.print(ring.getCount());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static class CarbonStructure {
		protected long count;

		// Only abstract classes can declare abstract methods.
		public Number getCount() throws IOException; // q1

		public CarbonStructure(int count) {
			this.count = count;
		}
	}

	private static class Diamond extends CarbonStructure {
		public Diamond() {
			super(15);
		}

		public Long getCount() throws FileNotFoundException { // q2
			return count;
		}
	}
}

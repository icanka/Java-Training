package hw8;

public class Q47 {
	public static void main(String[] args) throws Throwable {
		final Source bulb = new LightBulb();
		bulb.flipSwitch();
	}

	private static interface Source {
		void flipSwitch() throws Exception;
	}

	private static class LightBulb implements Source {

		@Override
		public void flipSwitch() {
			try {
				throw new RuntimeException("Circuit Break!");
				// Finally executed first, followed by a thrown RuntimeException to the caller.
			} finally {
				System.out.print("Flipped! ");
			}
		}

	}
}

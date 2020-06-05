package hw8;

public class Q42 {
	private static class Implementation implements Outfielder {
		// Invalid override
		public int catchBall() throws BadCatchException {
		}
	}

	private static class CorrectImplementation implements Outfielder {
		// Correct override
		public void catchBall() throws OutOfBoundsException {
		}
	}

	private static class InvalidImplementation implements Outfielder {
		// Can't throw a broader exception.
		public void catchBall() throws BadCatchException {
		}
	}

	private static interface Outfielder {
		public void catchBall() throws OutOfBoundsException;
	}

	private static class OutOfBoundsException extends BadCatchException {
	}

	private static class BadCatchException extends Exception {
	}
}

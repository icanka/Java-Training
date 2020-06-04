package hw8;

public class Q24 {
	public static void main(String[] args) {
		try {
			// This exception is not handled neither declared in the
			// method signature.
			new Computer().Compute();
			System.out.print("Ping");
		} catch (NullPointerException e) {
			System.out.print("Pong");
			throw e;
		}
	}

	private static class Computer {
		public void Compute() throws Exception {
			throw new RuntimeException("Error processing request");
		}
}

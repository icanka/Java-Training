package hw8;

public class Q10 {
	public static void main(String[] args) {

		// Because openDrawbridge declares that it can throw
		// an Exception main method should also declare it or
		// handle it.
		new Fortess().openDrawbridge(); // p3

	}

	private static class Fortess {
		public void openDrawbridge() throws Exception { // p1

			// both try-catch and throws declarations are unnecessary
			// since we are already handling the exception.
			// Or we can say that we are already bubbling up the exception to
			// delegate the handling to someone else, so why are we handling it here?
			try {
				throw new Exception("Circle");
			} catch (Exception e) {
				System.out.println("Opening!");
			} finally {
				System.out.print("Walls"); // p2
			}
		}
	}
}

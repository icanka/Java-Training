package hw7;

public class Q18 {

	public static void main(String[] args) {

		// We cannot instantiate an abstract class.
		final Triangle shape = new IsoscelesRightTriangle(); // g3
	}

	private static abstract class Triangle {
		abstract String getDescription();
	}

	private static class RightTriangle extends Triangle {

		// Correctly overrides method getDescription in parent class
		protected String getDescription() {
			return "rt";
		} // g1
	}

	private static abstract class IsoscelesRightTriangle extends RightTriangle { // g2

		// This class also overrides getDescription from its parent class
		// which is RightTriangle.
		public String getDescription() {
			return "irt";
		}

	}
}

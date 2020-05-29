package hw7;

public class Q31 {

	public static void main(String[] args) {
		Square square = new Square();
		square.getEqualSides();
	}

	private static abstract class Parallelogram {
		private int getEqualSides() {
			return 0;
		}
	}

	private static class Rectangle extends Parallelogram {
		public static int getEqualSides() {
			return 2;
		}

	}

	// instance methods cannot override static methods.
	// and static methods cannot hide instance methods.
	private static class Square extends Rectangle {
		public int getEqualSides() {
			return 4;
		}
	}

}

package hw7;

public class Q9 {

	public static void main(String[] chips) {
		System.out.println(new Laptop().process());
	}

	// process method is declared final. It cannot be overridden.
	private static class Computer {
		protected final int process() {
			return 5;
		}
	}

	// final methods cannot be overridden.
	private static class Laptop extends Computer {
		public final int process() {
			return 3;
		}
	}
}

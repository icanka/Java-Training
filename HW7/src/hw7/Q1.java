package hw7;

public class Q1 {

	public static void main(String[] args) {

		// Cannot access name variable since it is declared as private in superclass
		System.out.println(new Movie("Another Trilogy").name);

	}

	private static class Cinema {
		private String name;

		public Cinema(String name) {
			this.name = name;
		}
	}

	// No implicit constructor in Cinema class
	// so super() can not be inserted by the compiler.
	// wee need to explicitly call another constructor.
	private static class Movie extends Cinema {
		public Movie(String movie) {
		}

	}

	interface deneme {
		private void method() {
		}
	}

}

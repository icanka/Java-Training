package hw2;

public class Q15 {

	private static int x;
	// instance initializer
	{
		System.out.println("instance initializer");
	}

	public Q15() {
		System.out.println("constructor");
	}

	// static initializer
	static {
		System.out.println("static initializer");
	}

	// instance initializer
	{
		System.out.println("instance initializer");
	}

	public static void main(String... args) {
		// Static initializer only runs once when the class is loaded.
		Q15 q15 = new Q15();
		System.out.println("---------------");
		Q15 q15_2 = new Q15();

	}
}

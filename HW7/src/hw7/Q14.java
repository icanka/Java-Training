package hw7;

public class Q14 {

	public static void main(String[] args) {
		new Sprint().walk();
	}

	private static interface Run {
		default void walkSuper() {
			System.out.print("Walking and running!");
		}

	}

	private static interface Jog extends Run {
		default void walk() {
			System.out.println("Walking and jogging!");
			walkSuper();
		}

	}

//	 a class can implement both interfaces which has
//	 duplicate default methods as long as it overrides it because
//	 otherwise there is an ambiguity on which method will
//	 be invoked.
	private static class Sprint implements Run, Jog {

	}

}

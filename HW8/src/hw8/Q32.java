package hw8;

public class Q32 {

	public static void main(String[] args) {

		final BigCat kitty = new Lion(); // m3
		final BigCat kittness = new Lion();

		// Inherited roar with arguments get executed
		// throwing IllegalArgumentException in process
		// This kitty cannot roar :)
		try {
			kitty.roar(2);
		} catch (IllegalArgumentException e) {
			System.out.println("Hey, I got some exception here!");
		}

		kittness.roarV2(6);

	}

	private static class BigCat {

		// Important
		// mistyped keyword "throw" instead of "throws" causes
		// compilation error but for the sake of fun let's correct that
		void roar(int level) throws RuntimeException { // m1
			if (level < 3)
				throw new IllegalArgumentException("Incomplete");
			System.out.println("Roar!");
		}

		// let's write method which is going to get overrided.
		void roarV2(int level) throws RuntimeException {
			if (level < 3)
				throw new IllegalArgumentException("Incomplete");
			System.out.println("Scary Roar!");
		}
	}

	private static class Lion extends BigCat {

		// This method overloads the roar method, not overriding!
		public void roar() {
			System.out.println("Roar!!!");
		}

		// Overrides superclass roarV2 method
		public void roarV2(int level) {
			System.out.println(level + "X Scarier ROARRRR!");
		}
	}

}

package hw8;

public class Q30 {
	public static void main(String[] args) {
		Duck itQuacks = new Ducklings(5);
		System.out.print(itQuacks.getDuckies());
	}

	private static abstract class Duck {
		// count variable takes the default value of zero.
		protected int count;

		public abstract int getDuckies();
	}

	private static class Ducklings extends Duck {
		private int age;

		public Ducklings(int age) {
			this.age = age;
		}

		// Because count instance variable is zero method throws
		// ArithmeticException
		public int getDuckies() {
			return this.age / this.count;
		}
	}
}

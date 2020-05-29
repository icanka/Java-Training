package hw7;

public class Q21 {

	public static void main(String[] args) {

		System.out.print(new Encyclopedia().getMaterial());

	}

	private static abstract class Book {
		protected static String material = "papyrus";

		public Book() {
		}

		public Book(String material) {
			this.material = material;
		}
	}

	private static class Encyclopedia extends Book {
		public static String material = "cellulose";

		public Encyclopedia() {
			super();
		}

		public String getMaterial() {
			return super.material;
		}
	}
}

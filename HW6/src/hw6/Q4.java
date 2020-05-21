package hw6;

public class Q4 {

	public static void main(String[] args) {

		// nested() method does not return anything that print can output.
		System.out.print(new Dolls().nested());

	}

	private static class Dolls {
		public void nested() {
			nested(2, true);
		} // g1

		public int nested(int level, boolean height) {
			return nested(level);
		}

		public int nested(int level) {
			return level + 1;
		} // g2

	}

}

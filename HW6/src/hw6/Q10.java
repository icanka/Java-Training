package hw6;

public class Q10 {

	public static void main(String[] args) {

		// prints 5
		System.out.print(new Jump().rope);

	}

	private static class Jump {
		private int rope = 1;
		protected boolean outside;

		public Jump() {
			this(4);
			outside = true;
		}

		public Jump(int rope) {

			// since the default value of booleans are false, rope+1 is evaluated.
			this.rope = outside ? rope : rope + 1;
		}
	}

}

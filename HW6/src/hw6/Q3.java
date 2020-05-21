package hw6;

public class Q3 {

	public static void main(String[] args) {
		new Bond().sell();
		System.out.println(Bond.price);
	}

	private static class Bond {
		private static int price = 5;

		// It is true that one of this conditions is going to evaluate to true since
		// price is either <10, or >=10, but as far as the compiler cares, if both of
		// the if-then statement’s conditions returns false, function does not return a
		// boolean value while it is declared as to return a boolean.
		public boolean sell() {
			if (price < 10) {
				price++;
				return true;
			} else if (price >= 10) {
				return false;
			}
		}
	}

}

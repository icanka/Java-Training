package hw3;

public class Q50 {

	public static void main(String[] args) {
		System.out.println(Baby.play(5, 2));
			
	}

	private static class Baby {

		public static String play(int toy, int age) {
			final String game;
			if (toy < 2)
				// Ternary operator returns int but the variable
				// it is being assigned to is an integer variable
				game = age > 1 ? "1" : "10";
			else
				game = age > 3 ? "Ball" : "Swim";
			return game;

		}
	}

}

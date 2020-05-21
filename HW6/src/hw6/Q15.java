package hw6;

public class Q15 {

	public static void main(String[] args) {

		final Ski mySkier = new Ski();
		mySkier.age = 16;
		final int[] mySpeed = new int[1];
		final String myName = "Rosie";

		// Object reference is set to null at the end of the function
		// Other variables left unchanged.
		Ski.slalom(mySkier, mySpeed, myName);

	}

	private static class Ski {
		private int age = 18;

		private static void slalom(Ski racer, int[] speed, String name) {
			racer.age = 18;
			name = "Wendy";
			speed = new int[1];
			speed[0] = 11;
			racer = null;
		}
	}

}

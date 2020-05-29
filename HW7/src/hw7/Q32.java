package hw7;

public class Q32 {

	public static void main(String[] args) {
		Helicopter heli = (Helicopter) new Rotorcraft();
	}

	// A class with an abstract method declaration must be an abstract class.
	private static class Rotorcraft {
		protected final int height = 5;

		abstract int fly();
	}

	private static class Helicopter extends Rotorcraft {
		private int height = 10;

		protected int fly() {
			return super.height;
		}
	}

}

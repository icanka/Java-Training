package hw3;

public class Q38 {

	public static void main(String[] args) {
		int colorOfRainbow = 10;
		int red = 5;

		switch (colorOfRainbow) {
		default:
			System.out.print("Home");
			break;

		/*
		 * The values in each case statement must be compile-time constant values of the
		 * same data type as the switch value. This means we can use only literals, enum
		 * constants, or final constant variables of the same data type.
		 */
		case red:
			System.out.print("Away");
		}
	}

}

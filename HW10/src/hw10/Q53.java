package hw10;

public class Q53 {
	public static void main(String[] args) {
		short x = 1;
		int y = 4;
		final long winter = 10;
		final byte season = 2;
		int fall = 4;
		final short summer = 3;

		switch (season) {
		case 1:

			// winter is type long, not compatible with switch statements.
		case winter:
			System.out.print("winter");

			// There is already a default defined.
		default:

			// fall is compatible but it is not constant. It should have been declared as
			// final.
		case fall:
			System.out.print("fall");

		case summer:
			System.out.print("summer");

		default:

		}

	}
}

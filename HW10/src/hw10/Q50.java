package hw10;

public class Q50 {
	public static void main(String[] args) {

		// swing(0,0) will pring 24
		new Q50().swing(0, 0); // p2

		// This line will print 5, summing up to "245"
		System.out.print("5");
	}

	public static void swing(int... beats) throws ClassCastException {
		try {

			// This will throw runtime exception since, beat[2] is out of range.
			System.out.print("1" + beats[2]); // p1

			// first catch block will catch the exception which will print 2
		} catch (RuntimeException e) {
			System.out.print("2");
		} catch (Exception e) {
			System.out.print("3");

			// finally, runs no matter what. This will print 4.
		} finally {
			System.out.print("4");
		}
	}
}

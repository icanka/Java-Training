package hw3;

public class Q30 {

	public static void main(String[] args) {
		int x = 10, y = 5;

		boolean w = true, z = false;

		// Since w is true, y-- is not evaluated. y++ expression gets evaluated.
		// x is assigned to y, and then y is incremented by one. (Post-unary)
		x = w ? y++ : y--;
		// y is 6 now

		// !z is true so w is assigned to true which it already was.
		w = !z;

		// (w ? 5 : 10) return 5 since w is true
		// x (5) + y (6) is 11 since y was incremented.
		System.out.println((x + y) + " " + (w ? 5 : 10));
	}

}

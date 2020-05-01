package hw3;

public class Q40 {

	public static void main(String[] args) {

		// Operator precedence is overridden with parentheses
		// so three is added with two before divided by 5.
		int turtle = 10 * (2 + (3 + 2) / 5);
		System.out.println(turtle);

		// turtle variable is bigger than 5 so ternary returns 25
		int hare = turtle < 5 ? 10 : 25;
		System.out.println(hare);

		// Lastly turtle < hare evaluates to false and hence ternary returns.
		// "Turtle wins!".
		System.out.println(turtle < hare ? "Hare wins!" : "Turtle wins!");

	}

}

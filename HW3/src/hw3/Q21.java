package hw3;

public class Q21 {

	public static void main(String[] args) {
		/*
		 * "+" : Is the only overloaded operator in Java which will concatenate Number
		 * to String. It is also left-associative. So 5 + 6 is both numeric so they are
		 * added, 11 + “7” evaluates to a concatenation since + operator is overloaded
		 * and “7” is a string. Result is “117” which is a string and so on, this causes
		 * chain reaction
		 */
		System.out.print(5 + 6 + "7" + 8 + 9);

	}

}

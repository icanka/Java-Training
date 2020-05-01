package hw3;

public class Q18 {

	public static void main(String[] args) {

		int dayOfWeek = 6;

		// The values in each case statement must be compile-time
		// constant values of the same data type as the switch value
		// or a type that can be promoted implicitly by java.
		// for an integer these types are byte, short, char
		// for type 'long' to work it must be explicitly downcasted
		// to integer type
		// case (int) saturday:
		final byte saturday = 6;
		switch (dayOfWeek) {
		default:
			System.out.println("Another Weekday");
			break;
		case saturday:
			System.out.print("Weekend!");
		}

	}

}

package hw10;

public class Q47 {
	public static void main(String[] args) {

		// cannot convert from int to char, or Character
		char one = Integer.parseInt("1");
		Character two = Integer.parseInt("2");

		int three = Integer.parseInt("3");
		Integer four = Integer.parseInt("4");

		// cannot convert from int to short or Short types
		short five = Integer.parseInt("5");
		Short six = Integer.parseInt("6");
	}
}

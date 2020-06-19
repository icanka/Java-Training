package hw10;

public class Q48 {

	// Overloaded methods.
	public int drive(long car) {
		return 2;
	}

	public int drive(double car) {
		return 3;
	}

	public int drive(int car) {
		return 5;
	}

	public int drive(short car) {
		return 3;
	}

	public static void main(String[] gears) {
		// Three types can be used to acquire output 3.
		// short, double and float ( which will be promoted to double )
		short value = 5;
		System.out.print(new Q48().drive(value));
	}
}

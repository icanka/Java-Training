package hw5;

public class Q41 {

	public static void main(String[] args) {

		// We need to terminate the outer while loop
		// we need labeled break statement for that.
		t: while (true) {
			f: while (true) {
				break t;
			}
		}

		System.out.println("Not an infinite loop");

	}

}

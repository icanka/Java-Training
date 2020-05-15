package hw5;

public class Q39 {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		String str = new String("Leaves growing");

		do {
			System.out.println(str);

		} while (builder); // while condition must evaluate to a boolean value.

		System.out.println(builder);
	}

}

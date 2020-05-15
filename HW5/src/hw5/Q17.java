package hw5;

public class Q17 {

	public static void main(String[] args) {

		// int count = 0 ; for correction.
		do {

			// count variable is in the scope of this loop only.
			int count = 0;
			do {
				count++;
			} while (count < 2);

			break;

		} while (true);

		// count variable is not in the scope here
		System.out.println(count);
	}

}

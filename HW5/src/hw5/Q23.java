package hw5;

public class Q23 {

	public static void main(String[] args) {

		letters: for (char ch = 'a'; ch <= 'z'; ch++) {
			numbers: for (int n = 0; n <= 10; n++) {
				System.out.println(ch);

				// Labeled break statement, terminates the loop labeled with the same name
				break numbers;

				// An unlabeled break statement terminates the innermost loop.
				// break;
				// Both ends the inner loop and resumes from the outer loop.
			}

		}
	}

}

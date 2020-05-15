package hw5;

public class Q24 {

	public static void main(String[] args) {
		letters: for (char ch = 'a'; ch <= 'z'; ch++) {
			numbers: for (int n = 0; n <= 3; n++) {
				System.out.println(ch);
				// A labeled continue statement skips the current
				// iteration of an outer loop marked with the given label.
				continue letters;
			}

		}
	}

}

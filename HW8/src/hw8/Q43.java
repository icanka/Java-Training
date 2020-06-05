package hw8;

public class Q43 {
	public static void main(String[] args) {
		dancing();
	}

	public static void dancing() throws RuntimeException {
		try {
			throw new IllegalArgumentException();
			
		// Syntax error here, variable name is forgotten.
		} catch (Error) {
			System.out.print("Unable!");
		}
	}
}

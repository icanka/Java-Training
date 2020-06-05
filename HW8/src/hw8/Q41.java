package hw8;

public class Q41 {
	public static void main(String[] args) {
		try {
			throw new IllegalArgumentException();
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException();
		} catch (RuntimeException e) {
			throw new NullPointerException();
		} finally {
			// finally block will be executed whether before blocks throwed some
			// exceptions or not.
			throw new RuntimeException();
		}
	}
}

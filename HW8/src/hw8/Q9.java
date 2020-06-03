package hw8;

public class Q9 {
	public static void main(String[] args) {
		try {
			System.out.print('A');
			throw new RuntimeException("Out of Bounds!");
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.print('B');

			// this code does not compile with below line
			// throw t;
		} finally {
			System.out.print('C');
		}
	}
}

package hw8;

public class Q12 {
	public static void main(String[] args) {

		try {
			System.out.print(1);
			throw new ClassCastException();

			// This catch block does not get executed since ClassCastException
			// is not subclass of ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.print(2);

			// ClassCastException is handled by this catch block
		} catch (Throwable ex) {
			System.out.print(3);
		} finally {
			System.out.print(4);
		}

		System.out.print(5);

	}
}

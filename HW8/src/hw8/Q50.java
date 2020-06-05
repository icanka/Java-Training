package hw8;

public class Q50 {
	public static void snore() {
		try {
			String sheep[] = new String[3];
			System.out.print(sheep[3]);
		} catch (RuntimeException e) {
			System.out.print("Awake!");
		} finally {

			// throws and checked exception which should be handled or declared.
			throw new Exception(); // x1
		}
	}

	public static void main(String[] args) { // x2
		snore(); // x3
	}
}

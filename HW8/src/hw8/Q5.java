package hw8;

public class Q5 {
	public static void main(String... teams) {
		try {
			// score local variable variables scope is limited to this scope
			// it does not exist outside of this block.
			int score = 1;
			System.out.println(score++);
		} catch (Throwable t) {
			System.out.println(score++);
		} finally {
			System.out.println(score++);
		}
		System.out.println(score++);
	}
}

package hw6;

public class Q47 {

	public static void main(String[] args) {
		final int startTime = 4;

		// integer cannot be promoted to long.
		System.out.print(getScore(startTime));
	}

	public static long getScore(Long timeRemaining) {
		return 2 * timeRemaining;
	}

}

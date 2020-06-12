package hw9;

public class Q44 {
	public static void main(String[] args) {

		// An exmaple of plusXXX method.
		LocalTime time = LocalTime.now();
		// Add one our
		time = time.plusHours(1);
		// Subtract 25 minutes.
		time = time.minusMinutes(25);
		System.out.println(time);
	}
}

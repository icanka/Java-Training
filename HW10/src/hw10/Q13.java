package hw10;

import java.time.LocalTime;

public class Q13 {

	public static void main(String... nums) {
		LocalTime time = LocalTime.of(1, 11);
		System.out.println(time.getHour());

		// Since time.getHour returns 1, this while loop is never branched.
		// Hence no line is printed. But keep in mind that time.plusHours is
		// dangerous since it return a copy, not a reference to the time object
		// itself, since the LocalTime class is immutable. If the while condition
		// was to evaluate true, we would have an infinite loop situation.
		while (time.getHour() < 1) {
			time.plusHours(1);
			System.out.println("in loop");
		}
	}

}

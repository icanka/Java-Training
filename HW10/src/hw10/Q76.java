package hw10;

import java.time.LocalDate;

public class Q76 {

	public static void main(String... nums) {

		// No such method that takes (int, int)
		// It should be (int, Month, int)
		LocalDate time = LocalDate.of(1, 11);

		// No such as method getHour or plus(Hours) too.
		while (time.getHour() < 1) {
			time.plusHours(1);
			System.out.println("in loop");
		}
	}

}

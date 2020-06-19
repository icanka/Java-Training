package hw10;

import java.time.LocalDate;
import java.time.Month;

public class Q78 {
	public static void main(String... strings) {
		int count = 0;
		LocalDate date = LocalDate.of(2017, Month.JANUARY, 1);

		// The while loop runs 9 times
		while (date.getMonth() != Month.APRIL)
			date = date.minusMonths(1);
		// count is no in the while block so it is incremented just once.
		count++;
		System.out.println(count);
		System.out.println(date.getYear());
	}
}

package hw10;

import java.time.LocalDate;
import java.time.Period;

public class Q59 {
	public void main(String h) {
		// Constructor LocaDate is not visible.
		LocalDate newYears = new LocalDate(2017, 1, 1);
		Period period = Period.ofYears(1).ofDays(1);

		// There is no such class as DateTimeFormat
		DateTimeFormat format = DateTimeFormat.ofPattern("MM-dd-yyyy");
		System.out.print(format.format(newYears.minus(period)));
	}
}

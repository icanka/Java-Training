package hw9;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Q45 {

	public static void main(String[] args) {
		// Create a new Local date with the specified date.
		LocalDate newYears = LocalDate.of(2017, 1, 1);
		// A period of 1 day
		Period period = Period.ofDays(1);
		// Create a formatter with the given pattern.
		DateTimeFormatter format = DateTimeFormatter.ofPattern("mm-dd-yyyy");
		// Subtract the LocalDate with the period, format the result and print it.
		// 
		System.out.print(format.format(newYears.minus(period)));
	}

}

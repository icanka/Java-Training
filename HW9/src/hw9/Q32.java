package hw9;

import java.time.LocalDate;

public class Q32 {

	public static void main(String[] args) {
		
		// Obtains a LocalDate, with the specified parameters.
		LocalDate xmas = LocalDate.of(2016, 12, 25);
		// xmas object is unchanged since plusDays return a copy.
		xmas.plusDays(-1);
		
		System.out.println(xmas.getDayOfMonth());
	}

}

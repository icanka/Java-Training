package hw9;

import java.time.LocalDate;

public class Q50 {

	public static void main(String[] args) {
		LocalDate xmas = LocalDate.of(2016, 12, 25);

		// No method such as setYear, it is undefined for the type LocalDate.
		xmas.setYear(2017);
		System.out.println(xmas.getYear());
	}

}

package hw9;

public class Q38 {
	public static void main(String[] args) {
		LocalDate newYears = LocalDate.of(2017, 1, 1);

		// Define a 1 day period
		Period period = Period.ofDays(1);

		// Define a format to represent the day.
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		// Subtract the period from the newYear date and format it according to format
		// defined and then print it.
		System.out.print(format.format(newYears.minus(period)));
	}
}

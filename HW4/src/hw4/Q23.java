package hw4;

public class Q23 {

	public static void main(String[] args) {
		String[] days = new String[] { "Sunday", "Monday", "Tuesday", 
									 "Wednesday", "Thursday", "Friday", "Saturday" };
		
		// Code does not compile because size method
		// is a Collection interface method, we should use the instance
		// variable length instead.
		for (int i = 0; i < days.size(); i++) {
			System.out.println(days[i]);
		}
	}

}

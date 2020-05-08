package hw4;

public class Q35 {

	public static void main(String[] args) {
		String[] days = new String[] { "Sunday", "Monday", "Tuesday",
								"Wednesday", "Thursday", "Friday", "Saturday" };
		
		// Starts with index one which is the second element.
		// Last iteration tries to access 7th element where there is none
		// Throws exception on the last iteration. ArrayIndexOutOfBounds
		for (int i = 1; i <= days.length; i++) {
			//System.out.println(i);
			System.out.println(days[i]);
		}
	}

}

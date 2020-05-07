package hw4;

public class Q8 {

	public static void main(String[] args) {
		
	
		String[] days = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday",
				"Thursday", "Friday", "Saturday"};
		
		// length of the array, which is 7.
		System.out.println(days.length);
		
		
		// FOr loop traverse through the array and
		// prints its elements.
		
		// starts with 0, runs a last time at 6
		// which is the last index in our array
		for (int i = 0; i < days.length; i++) {
			System.out.print(i+1 + ". element: ");
			System.out.println(days[i]);
		}
	}

}

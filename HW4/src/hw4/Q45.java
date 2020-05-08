package hw4;

public class Q45 {

	public static void main(String[] args) {
		String[] days = new String[] { "Sunday", "Monday", "Tuesday", 
								"Wednesday", "Thursday", "Friday", "Saturday" };
		
		// Starting from index 1, until the last iteration with i = 6
		// which corresponds to the index of the last element in the array.
		// First element which has the index 0 will not get printed.
		for(int i = 1; i < days.length; i++)
			System.out.println(days[i]);
	}

}

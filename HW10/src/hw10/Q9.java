package hw10;

public class Q9 {

	public static void main(String[] args) {
		
		// Interns the string
		final String ceiling = "up";
		
		// Creates a new String object in the heap
		String floor = new String("up");
		
		// Still creates a new object in the heap using the floor string.
		final String wall = new String(floor);
		
		// As a result, all three of them points to different objects.
		System.out.print((ceiling==wall) + " " + (floor==wall) + " " + ceiling.equals(wall));
		
	}

}

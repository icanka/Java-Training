package hw10;

public class Q8 {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("Leaves growing");
		do {
			
			// Deletes items from the StringBuilder starting from the 
			// index 0, through index 4.
			builder.delete(0, 5);
			System.out.println(builder);
			
			// Don't execute the do block unless the length is greater than 5.
			// This guarantees a non-empty StringBuilder.
		}while ( builder.length() > 5);
		
		System.out.println(builder);
	}

}

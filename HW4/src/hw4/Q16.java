package hw4;

public class Q16 {

	public static void main(String[] args) {
		String[][] matrix = new String[1][2];
		matrix[0][0] = "Don't think you are, know you are.";
		matrix[0][1] = "I'm trying to free your mind Neo.";
		
		// Both lines below throw an indexOutOfBOund exception
		// Array indexes starts at one, and since the length of the
		// first dimension is 1, trying to access second element
		// throws exception.
		matrix[1][0] = "Is all around you ";
		matrix[1][1] = "Why oh why didn't I take the BLUE pill?";
		
	} }
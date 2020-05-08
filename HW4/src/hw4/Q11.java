package hw4;

public class Q11 {

	public static void main(String[] args) {
		int[] intArray = new int[] {1, 2, 3, 4, 5};
		
		// Array indexes always start with 0.
		System.out.println("First element: " + intArray[0]);
		// Because arrays start at index 0, we acquire the last element of the array
		// with intArray.length - 1 .
		System.out.println("Last element: " + intArray[intArray.length - 1]);
		
	}

}

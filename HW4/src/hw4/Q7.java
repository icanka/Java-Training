package hw4;

public class Q7 {

	public static void main(String[] args) {
		
		// Because an array is an object, it’s allocated using the keyword new, 
		// followed by the type of value that it stores, and then its size. 
		
		// Invalid syntax for declaring array size.
		int[][] blue = new int[2, 2];     
		int[][] blue = new int[2], [2];
		int[][] blue = new int[2 x 2];
		
		// correct syntax for allocating a 2x2 array
		int[][] blue = new int[2][2];
	}

}

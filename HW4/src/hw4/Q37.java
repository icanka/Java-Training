package hw4;

public class Q37 {

	public static void main(String[] args) {
		
		// r1 is a valid declaration and allocation for a 3x3 array
		char[][] ticTacToe = new char[3][3];                    // r1
		
		// r2 is also valid, assigning a char primitive to an element
		ticTacToe[0][0] = 'X';									// r2
		ticTacToe[1][1] = 'X';
		ticTacToe[2][2] = 'X';
		
		// r3 is valid too printing the length of the array and
		// concatenating with a string literal.
		System.out.println(ticTacToe.length + " in a row!");	// r3
	}

}

package hw4;

public class Q18 {

	public static void main(String[] args) {
		
		// Incorrect syntax for defining size of an array.
		// new T[3][3] is the correct syntax.
		char[][] ticTacToe = new char [3, 3]; // Does not compile
		
		// Although not causing compilation error, this line
		// causes runtime exception.
		ticTacToe[1][3] = 'X'; // Does not cause compilation error, but runtime exception.
		ticTacToe[2][2] = 'X';
		ticTacToe[3][1] = 'X'; // This line is also tries to access an element out of bounds.
		System.out.println(ticTacToe.length + " in a row!");
		
	}

}

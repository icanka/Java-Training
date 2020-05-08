package hw4;

public class Q26 {

	public static void main(String[] args) {
		char[][] ticTacToe = new char[3][3];
		
		// Tries to assign to out of bound area.
		// Throws ArrayIndexOutOfBound exception at runtime.
		ticTacToe[1][3] = 'X';
		ticTacToe[2][2] = 'X';
		
		// Also tries to assign to out of bound area.
		ticTacToe[3][1] = 'X';
		System.out.println(ticTacToe.length + " in a row!");
	}

}

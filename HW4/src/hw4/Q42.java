package hw4;

public class Q42 {

	// Because arrays are objects, and class variables gets initialized with
	// default values game reference type variable gets the default value 
	// null
	static int[][] game;
	
	public static void main(String[] args) {
		
		// We could also get an NullPointerException here at runtime
		// because game is null.
		game[3][3] = 6;
		Object[] obj = game;
		
		// Code will not compile because of type mismatch.
		game[3][3] = "X";
		System.out.println(game[3][3]);
	}

}

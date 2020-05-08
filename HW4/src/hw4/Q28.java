package hw4;

public class Q28  {

	static int[][] game = new int[6][6];
	
	public static void main(String[] args) {
		game[3][3] = 6;
		// obj is an array which elements refer to int[]
		Object[] obj = game;
		
		// Assigning a String to a int[]
		obj[3] = 'X';
		System.out.println(game[1]);
		System.out.println(obj[1]);
	}

}

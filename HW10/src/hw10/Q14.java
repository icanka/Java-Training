package hw10;

public class Q14 {

	static int[][] game;

	public static void main(String[] args) {

		// array is not initialized, hence this line throws a NullPointerException.
		game[3][3] = 6;

		Object[] obj = game;

		// It explains itself.
		if (obj[3] instanceof int[]) {
			System.out.println("Its an array of int.");
		} else {
			System.out.println("Its not an array of int.");
		}

		// obj[3] refers to an one dimensional array of integers, with the length of 4.
		// so trying to assign a character where instead it should be an int[], we would
		// get an ArrayStoreException.
		obj[3] = 'X';
		System.out.println(game[3][3]);
	}

}

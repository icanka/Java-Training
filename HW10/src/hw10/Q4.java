package hw10;

import java.util.ArrayList;

public class Q4 {

	public static void main(String[] args) {
		int[] crossword[] = new int[10][20];

		// Correctly, and without trying to access out of bounds
		// this loop iterates through the two-dimensional array.
		// It only iterates through the half of the every array in the
		// second dimension though.
		for (int i = 0; i < crossword.length; i++)
			for (int j = 0; j < crossword.length; j++)
				crossword[i][j] = 'x';
		// This line has to be changed. There is no size() method for arrays
		// we need to use the length member variable instead.
		System.out.println(crossword.size());

	}

}

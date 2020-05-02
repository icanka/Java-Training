package hw3;

public class Q10 {

	public static void main(String[] args) {

		int pterodactyl = 6;
		long triceratops = 3;

		// This boolean expression evaluates to false since
		// 6 % 3 = 0 and 0 is not greater than or equal to 1
		if (pterodactyl % 3 >= 1)
			// This part won't be branched since the if boolean
			// expression returned false. So triceratops isn't
			// going to be incremented.
			triceratops++;

		// triceratops post-decremented
		triceratops--;

		//
		System.out.print(triceratops);
	}

}

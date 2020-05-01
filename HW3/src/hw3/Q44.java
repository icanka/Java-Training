package hw3;

public class Q44 {

	public static void main(String[] args) {
		int characters = 5;
		int story = 3;

		/*
		 * characters is not smaller or equal to 4 so 3 is not returned. right side of
		 * the ternary operator gets evaluated in which there is another ternary
		 * operation. story is bigger than 1 so 2 is returned from that ternary
		 * operation to the outer ternary operation and assigned to the movieRating
		 * primitive type.
		 */
		double movieRating = (characters <= 4 ? 3 : (story > 1 ? 2 : 1));
		System.out.println(movieRating);
	}

}

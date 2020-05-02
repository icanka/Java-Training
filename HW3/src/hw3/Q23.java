package hw3;

public class Q23 {

	public static void main(String[] args) {
		int dog = 11;
		int cat = 3;
		// partA is 3
		int partA = dog / cat;

		// partB is the remainder which is 2
		int partB = dog % cat;

		// First partA is multiplied with cat which evaluates to 9 (3*3)
		// then added to partB which is 2
		int newDog = partB + partA * cat;
		System.out.print(newDog);
	}

}

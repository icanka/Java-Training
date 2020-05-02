package hw3;

public class Q28 {

	public static void main(String[] args) {
		int intersections = 100;
		int streets = 200;

		if (intersections < 150) {
			System.out.println("1");
		}
		/*
		 * Code does not compile because left-hand side of the && operator is not a
		 * boolean expression. Because intersections is smaller than 1000 this
		 * expression would never evaluated to true hence never branched, so ignoring
		 * the error code would print two 1's.
		 */ else if (streets && intersections > 1000) {
			System.out.println("2");
		}

		if (streets < 500)
			System.out.println("1");
		else
			System.out.println("2");

	}

}

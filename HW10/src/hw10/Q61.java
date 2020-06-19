package hw10;

public class Q61 {

	public static void main(String[] args) {

		// first the multiplication is done, 1 + 10 >= 2 ? 4 : 2
		// and then the addition operation, 11 >= 2 ? 4 : 2
		// fish evaluates to 4
		int fish = 1 + 2 * 5 >= 2 ? 4 : 2;

		// mammals evaluate to

		// 3 < 3 ? 1 : 9
		int mammals = 3 < 3 ? 1 : 5 >= 5 ? 9 : 7;
		// mammals evaluates to 9.

		// prints 13
		System.out.print(fish + mammals + "");

	}
}

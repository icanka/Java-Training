package hw5;

public class Q32 {

	public static void main(String[] args) {
		String[] fun = new String[] { "f1", "f2", "f3" };

		// This for loop iterates over the array backwards
		// and prints its elements.
		for (int i = fun.length - 1; i >= 0; i--)
			System.out.println(fun[i]);

		System.out.println("-----------");

		// Enhanced for loop only iterates one step forward.
		for (String str : fun) {
			System.out.println(str);
		}

	}

}

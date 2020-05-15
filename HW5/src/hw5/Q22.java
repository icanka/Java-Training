package hw5;

public class Q22 {

	public static void main(String[] args) {
		String[] fun = new String[] { "f1", "f2", "f3" };

		// Iterates over the array and prints its elements.
		for (int i = 0; i < fun.length; i++)
			System.out.println(fun[i]);

		for (String arrayElement : fun)
			System.out.println(arrayElement);

	}

}

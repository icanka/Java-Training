package hw5;

public class Q15 {

	public static void main(String[] args) {

		// Whether called with more than one arguments or zero argument
		// this code will execute in an everlasting loop because i>=0 is
		// always going to return true.
		for (int i = args.length; i > 0; i++)
			System.out.println("args");
	}

}

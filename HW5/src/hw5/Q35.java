package hw5;

public class Q35 {

	public static void main(String[] args) {

		// This will throw outOfBOunds exception
		// Last element's index in the array has the index of
		// arrayLength - 1
		for (int i = args.length; i >= 0; i--)
			System.out.println(args[i]);
	}

}

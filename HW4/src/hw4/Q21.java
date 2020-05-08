package hw4;

public class Q21 {

	public static void main(String[] args) {
		// Will throw ArrayIndexOutOfBounds exception at runtime
		// because we are assigning to an address outside of the
		// boundaries of the array.
		args[args.length] = "Times square";
	}

}

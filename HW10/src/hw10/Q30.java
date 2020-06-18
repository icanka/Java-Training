package hw10;

public class Q30 {
	static int min, max = 100; // max is assigned to 100 and min gets default value of 0.
	static int min = 0, max = 100; // Now both variables are assigned.

	// Because we are in a static context, we should refer to static variables.
	public static void main(String[] args) {
		System.out.println(max - min);

	}

}

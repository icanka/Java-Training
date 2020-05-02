package hw3;

public class Q25 {

	public static String travel(int distance) {
		// It is possible that the ternary can return an integer
		// but the method has to return a String, so we get a
		// Type mismatch compile time error.
		return distance < 1000 ? "train" : 10;
	}

	public static void main(String[] args) {
		System.out.println(travel(500));
	}

}

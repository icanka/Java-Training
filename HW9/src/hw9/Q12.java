package hw9;

public class Q12 {
	public static void main(String... strings) {
	}

	// add and get are both List interface methods, but length() method is a String
	// method,
	// also present in the StringBuilder class.
	public static void secret(ArrayList<String> mystery) {
		mystery.add("metal");
		// Because get is a generic method, we would have used ArraList<String> for the
		// method parameter
		// to be able to use get() method without casting, otherwise we would have to
		// cast because
		// get() method would have returned objects of type object, not string objects.
		String str = mystery.get(0);
		int num = mystery.length();
		System.out.println(num);
	}
}

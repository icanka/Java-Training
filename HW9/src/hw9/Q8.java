package hw9;

public class Q8 {
	public static void main(String... strings) {
		// Create an array with an initial capacity of 1.
		List<String> museums = new ArrayList<>(1);

		// Append Two elements.
		museums.add("Natural History");
		museums.add("Science");
		museums.add("Art");

		// The last element is removed which has the index 2 in this case.
		museums.remove(2);

		System.out.println(museums);
	}
}

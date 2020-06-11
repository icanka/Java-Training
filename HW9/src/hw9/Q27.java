package hw9;

public class Q27 {
	public static void main(String[] args) {

		// Creates a new string and assigns its reference to line variable.
		String line = new String("-");

		// line.concat("-") creates a new object with the given parameter
		// concatenated.
		String anotherLine = line.concat("-");

		// Since they do not refer to the same object this statement prints false.
		System.out.print(line == anotherLine);
		System.out.print(" ");
		System.out.print(line.length());
	}
}

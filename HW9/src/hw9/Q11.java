package hw9;

public class Q11 {

	public static void main(String... strings) {
		StringBuilder line = new StringBuilder("-");
		// "-" appended to the line StringBuilder, and the reference to
		// line is returned. Both variables refer to the same object now
		StringBuilder anotherLine = line.append();
		// Print true since they both refer to the same object.
		System.out.print(line == anotherLine);
		System.out.print(" ");
		// length is 2 since there is 2 character stored in the StringBuilder.
		System.out.print(line.length());

	}
}

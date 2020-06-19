package hw10;

public class Q73 {
	public static void main(String... strings) {

		// The code does not compile, String is typed wrong. First letter must be
		// uppercase.
		string bike1 = "speedy";
		string bike2 = new String("speedy");
		boolean test1 = bike1 == bike2;
		boolean test2 = bike1.equals(bike2);
		System.out.println(test1 + " " + test2);
	}
}

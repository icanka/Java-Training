package hw2;

public class Q28 {

	public static void main(String[] args) {
		Integer integer = new Integer(4);
		System.out.print(integer.byteValue());
		System.out.print("-");

		// Java allows assignment of Integer objects to int primitives and vice versa
		// via auto-boxing and auto-unboxing mechanism.
		int i = new Integer(4);

		// Cannot call method on a primitive since they're not objects.
		System.out.print(i.byteValue());

	}

}

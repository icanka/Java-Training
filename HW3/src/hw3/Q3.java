package hw3;

public class Q3 {

	public static void main(String[] args) {
		String john = "john";

		// Whole another object is created
		String jon = new String(john);

		/*
		 * For object comparison, the equality operator is applied to the references to
		 * the objects, not the objects they point to. Two references are equal if and
		 * only if they point to the same object, or both point to null. equals()
		 * standard method checks the values inside the String rather than the String
		 * object itself. If a class doesn’t have an equals method, Java determines
		 * whether the references point to the same object—which is exactly what ==
		 * does.
		 */

		// john and jon is not the same object, two different objects. But they sore the
		// same value
		System.out.print((john == jon) + " " + (john.equals(jon)));

	}

}

package hw2;

public class Q6 {

	public static void main(String[] args) {

	}

	/*
	 * Primitive types are not objects or rather, they don't hold the memory address
	 * of the object they refer too (They are not reference types, they don't refer
	 * to objects), they hold directly the actual value. So, we can not call methods
	 * on them like they refer to an object and we want to call a method from hat
	 * object variable refer to.
	 */

	// Won't compile. Trying to access instance method but variable does not refer
	// to a method.
	public String convert(int value) {
		return value.toString();
	}

	public String convert(Integer value) {
		return value.toString();
	}

	public String convert(Object value) {
		return value.toString();
	}

}

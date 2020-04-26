package hw2;

public class Q11 {

	public static void main(String[] args) {
		double d1 = 5f;  // implicit widening.
		double d2 = 5.0; // default decimal in java is double by default
		float f1 = 5f;   // f suffix to specify that the decimal literal if of type float.
		float f2 = 5.0;  // Compile time error as we are assigning larger type to smaller type without
						 // casting
		// Narrowing is explicit in java, we need to downcast the value
		// float f2 = (float) 5.0;
	}

}

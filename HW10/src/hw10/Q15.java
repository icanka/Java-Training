package hw10;

import java.util.ArrayList;
import java.util.List;

public class Q15 {

	public static void main(String[] args) {
		List<String> a = new ArrayList(); // Raw type warning.
		List<String> c = new ArrayList<>(); // Diamond operator indicates that this array is generic.

		// Although its not mandatory to give a type argument, because it is inferrible
		// by the compiler
		// from the argument given to the reference type on the left side, when
		// instantiating the
		// ArrayList, it is valid.
		List<String> e = new ArrayList<String>();

		// List<> b = new ArrayList(); // This does not even compile, we need to give it
		// a Type argument.
		// List<> d = new ArrayList<>(); // This does not compile too.
		// List<> f = new ArrayList<String>(); // Does not compile for the same reason
		// the other two.

	}

}

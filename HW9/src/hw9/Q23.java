package hw9;

import java.util.ArrayList;
import java.util.List;

public class Q23 {
	public static void main(String[] args) {

		// Create a new arrayList of Chars
		List<Character> chars = new ArrayList<>();
		// Add these two elements to it.
		chars.add('a');
		chars.add('b');
		// Replace the element at index 1 with 'c'
		chars.set(1, 'c');
		// Remove the first element which lefts only one element in
		// the list.
		chars.remove(0);
		// length() is not a List method.
		System.out.println(chars.length());

	}
}

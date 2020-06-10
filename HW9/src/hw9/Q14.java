package hw9;

import java.util.ArrayList;
import java.util.List;

public class Q14 {
	public static void main(String... strings) {
		List<Character> chars = new ArrayList<>();
		chars.add('a');
		chars.add('b');
		// List is [a, b] as of now.
		chars.set(1, 'c');
		// index 1 which has the character 'b' is replace with character 'c'
		// List is [a, c] now.
		chars.remove(0);
		// first element in the list is removed, leaving a list consisting of just one
		// element, 'c'.
		System.out.print(chars.size() + " " + chars.contains('b'));
		// since the 'b'is replaced by the character 'c' and the size of our list is 1.
		// "1 false" is printed.
	}
}

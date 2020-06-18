package hw10;

import java.util.Arrays;
import java.util.List;

public class Q41 {

	public static void main(String[] args) {
		String[] array = { "Natural History", "Science", "Art" };
		
		// Note that the returned List implementation is not the same everyday ArrayList
		// we use.
		// returned implementation does not support the operation remove()
		List<String> museums = Arrays.asList(array);
		museums.remove(2);
		System.out.println(museums);
	}

}

package hw5;

import java.util.Arrays;
import java.util.List;

public class Q13 {

	public static void main(String[] args) {
		List<String> bottles = Arrays.asList("glass", "plastic");

		// No increment or decrement statement used.
		for (int type = 0; type < bottles.size();) {
			System.out.println(bottles.get(type) + ",");
			break;
			// if break had not been used, loop would go on forever.

		}
		System.out.println("end");

	}

}

package hw5;

import java.util.Arrays;
import java.util.List;

public class Q33 {

	public static void main(String[] args) {
		List<String> bottles = Arrays.asList("glass", "plastic");

		// No brackets around for loop, break is out of loop statement.
		// Having the error corrected, code would print the first element
		// in the list in the first iteration and then exits the iteration since
		// break statement used.
		for (int type = 0; type < bottles.size();)
			System.out.println(bottles.get(type));
		break;

		System.out.println("end");
	}

}

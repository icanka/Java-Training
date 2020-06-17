package hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Q18 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(-5);
		list.add(0);
		list.add(5);

		
		// our test case is given as e<0, if the number is less than 0, it will be printed.
		print(list, e -> e < 0);
	}

	public static void print(List<Integer> list, Predicate<Integer> p) {
		for (Integer num : list)
			// test the every number in the list, print them if the test returns true.
			if (p.test(num))
				System.out.println(num);
	}

}

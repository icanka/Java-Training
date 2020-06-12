package hw9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Q47 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("-5");
		list.add("0");
		list.add("5");
		
		// Even if we had corrected the type parameter below, we would have encountered
		// encountered another compilation error because of the below line. Because then,
		// the given lambda expression would be trying to compare a string with an integer.
		print(list, e -> e < 0);
	}
	
	
	public static void print (List<String> list, Predicate<Integer> p) {
		for (String num : list)
			// Test accepts Integer type since we passed Integer as a type parameter
			if (p.test(num))
				System.out.println(num);
	}

}

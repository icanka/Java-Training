package hw9;

import java.util.ArrayList;
import java.util.List;

public class Q6 {

	public static void main(String[] args) {
		List<String> tools = new ArrayList<>();
		
		// Lists are index based, just like arrays
		tools.add("hammer");
		tools.add("nail");
		tools.add("hex key");
		
		// Print the element at the index 1, which is
		// "nail" in this case.
		System.out.println(tools.get(1));
	}

}

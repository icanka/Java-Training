package hw9;

import java.util.ArrayList;
import java.util.List;

public class Q48 {

	public static void main(String[] args) {
		
		// It is not recommended to use raw types.
		List<String> magazines = new ArrayList();
		
		magazines.add("Readers Digest");
		magazines.add("People");
		// Removes all of the elements from the list.
		magazines.clear();
		magazines.add("The Economist");
		// Throws IndexOutOfBoundsException exception at runtime 
		// because there is no element at the index 1 to remove
		magazines.remove(1);
		System.out.println(magazines.size());

	}

}

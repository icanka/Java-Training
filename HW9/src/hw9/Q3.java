package hw9;

public class Q3 {

	public static void main(String[] args) {
		
		// Creates an empty builder and appends "clown" to it
		System.out.println(new StringBuilder().append("clown"));
		
		// Creates a builder with the value "clown" 
		System.out.println(new StringBuilder("clown"));
		
		// Creates a builder with the value "cl" and inserts "own"
		// starting at the index 2, which yields "clown" as a result.
		System.out.println(new StringBuilder("cl").insert(2, "own"));

		
	}

}

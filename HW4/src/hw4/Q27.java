package hw4;

public class Q27 {

	public static void main(String... original) {
		
		// While it is just a syntactic sugar and inside the method packed as an
		// array, the ... syntax is only used as a method paremeter, as varargs. 
		String... copy = original;
		System.out.println(copy.length + " " + copy[0]);
	}

}

package hw10;

public class Q10 {

	public static void main(String[] args) {

		String lol = "lol";
		
		// Since String objects are mutable, all the methods which return
		// a string after that seems to mutate the string, actually returns
		// a new String object. Because again, Strings are immutable.
		
		
		System.out.println(lol.toUpperCase() == lol);
		System.out.println(lol.toUpperCase() == lol.toUpperCase());
		System.out.println(lol.toUpperCase().equals(lol));
		
		// These three return true. Since they are equality checks on the 
		// contents of the strings rather than the references,  and the ignoreCase is used
		// where the contents are different.
		System.out.println(lol.toUpperCase().equals(lol.toUpperCase()));
		System.out.println(lol.toUpperCase().equalsIgnoreCase(lol));
		System.out.println(lol.toUpperCase().equalsIgnoreCase(lol.toUpperCase()));

	}
}

package hw10;

public class Q68 {

	public static void main(String[] args) {
		seasons("Summer", "Fall", "Winter", "Spring");
	}

	public static void seasons(String... names) {
		// length of the names is 4
		
		// l is 4 since the second element's length is 4.
		int l = names[1].length();							// s1
		
		// names[4] is out of range.
		System.out.println(names[l]);						 // s2
	}

}

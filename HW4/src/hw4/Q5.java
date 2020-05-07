package hw4;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		
		// varags is essentially turning given variable number of arguments
		// to array so giving it and array or variable number of arguments
		// is same.
		printStormName("Arlene");
		printStormName(new String[] {"Bret"});
		
		printStormNames(new String[] {"Don"});
		
		// This function on the other hand expects an array of string 
		// so given a actual parameter of type string is not going to compile.
		printStormNames("Cindy");
	}
	
	static public void printStormName(String... names) {
		System.out.print(Arrays.deepToString(names));
	}
	
	static public void printStormNames(String[] names) {
		System.out.println(Arrays.toString(names));
	}

}

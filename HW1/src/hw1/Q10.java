package hw1;
import java.util.*;
import java.util.*;


/*
 * 'main' method is an instance method in this question
 * so we should considering accessibility in P1 block in the context of
 * class instance.
*/
public class Q10 {
	
	// class instances have access to static variables
	static String weight = "A lot";
	
	// Since these are instance variables, instances of this class can access them
	double ageMonths = 5, ageDays = 2;
	
	// private access modifier doesn't effect accessibility of P1 block
	// to this variable, because P1 is inside the class.
	private static boolean success = true;
	
	// 'main' method is an instance method.
	public void main(String[] args) {
		// Since this is a local variable, its accessible
		// in this method's block 
		final String retries = "1"; 
		//P1
	}

}

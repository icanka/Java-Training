package hw1;

public class Q21 {
	private static int yesterday = 1;
	int tomorrow = 10;
	
	public static void main(String[] args) {
		Q21 tolls = new Q21();
		/* 
		 * Declaration of the 'tomorrow' variable here 'shadows' the
		 * instance variable 'tomorrow' which has the value of 10
		 * but because fully-qualified name is used, instance variable.
		 * Worth noting that accessing a static variable using instance
		 * reference as used here to access 'yesterday' variable is
		 * discouraged and not recommended.
		*/
		
		// local variables, accessed directly with name.
		int today = 20, tomorrow = 40;
		
		// Evaluates to: 20 + 10 + 1
		// If written directly without instance reference, tomorrow
		// would evaluate to value 40 which is the local variable
		// tomorrow.
		System.out.print(today + tolls.tomorrow + tolls.yesterday);
		
		
	}
	
	private static class Tolls{
		
	}
}




package hw1;

public class Q45 {
	
	static int wheels = 1;
	int tracks = 5;
	
	public static void main(String[] arguments) {
		Q45 s = new Q45();
		
		// Local track variable gets evaluated.
		// there could be no shadowing here since main method
		// here is static and instance 'tracks' variable is
		// an instance variable. main method could'nt access
		// instance's variable if even there wasn't a local 'tracks'
		// variable.
		int feet = 4, tracks = 15;
		
		// 4 + 15 (local variable) + 1 --> 
		// (static variable accessed through instance)
		// = 20
		// Note that accessing static variables through instances
		// is discouraged
		System.out.print(feet + tracks + s.wheels);
		
	}

}

package hw1;

public class Q12 {
	
	int birds = 10;
	
	public static void main(String[] args) {
		int trees = 5;
		System.out.println("Hello World!");
		
		// The code does not compile, because we are trying to access
		// an instance variable in the static context.
		// We are trying to access a variable that doesn't even exist yet.
		System.out.println(trees+birds);
	}
}

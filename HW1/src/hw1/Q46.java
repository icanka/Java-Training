package hw1;

public class Q46 {
	
	String color = "red";
	
	
	// Local variable color, overrides instance variable.
	private void printColor(String color) {
		color = "purple";
		
		// Since the color is reassigned to "purple"
		// It's always going to print "purple" no matter
		// what is passed as an argument to the function.
		// Instance variable
		System.out.print(color);
	}
	
	public static void main(String[] rider) {		
		new Q46().printColor("bluasfassdae");
	}

}

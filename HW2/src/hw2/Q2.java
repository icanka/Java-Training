package hw2;

public class Q2 {
	private static String classVariable;
	private String instanceVariable;
	
	public static void main(String[] args) {
		
		// Code does not compile because chair variable is not initialized.
		// Unlike class and instance variables in java, local variables are not
		// initialized automatically to a default value.
		String chair, table = "metal";
		chair = chair + table;
		
		// trying to print an uninitialized variable.
		System.out.println(chair);
		
		// Class and instance variables have default values.
		Q2 q2Instance = new Q2();
		System.out.print(q2Instance.instanceVariable + " " + Q2.classVariable);
		
	}

}

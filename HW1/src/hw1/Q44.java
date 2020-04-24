package hw1;

public class Q44 {
	
	private boolean numLock = true;
	static boolean capLock = false;
	
	public static void main(String... shortcuts) {
		
		// numLock variable is an instance variable and we are
		// trying to access it from a static method. Code  does 
		// not compile.
		System.out.print(numLock + " " + capLock);
	}
	

}

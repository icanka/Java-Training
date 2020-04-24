package hw1;

public class Q48 {
	private static boolean heatWave = true;
	
	
	/*
	 * Code compiles without any issue, but does not run because there no
	 * proper entry point for the program Program arguments are missing in main
	 * method.
	 */	
	
	
	//public static void main(String... args)
	public static void main() {
	   /* having thought the method runs, it would have print
		* local variable heatWave which has the value of false, not the class 
		* variable heatWave Local heatWave shadows class variable heatWave.
		*/
		
		boolean heatWave = false;
		System.out.print(heatWave);
	}
}

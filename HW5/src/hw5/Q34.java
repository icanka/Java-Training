package hw5;

public class Q34 {

	public static void main(String[] args) {
		String[] nycTourLoops = new String[] { "Downtown", "Uptown", "Brooklyn" };
		String[] times = new String[] { "Day", "Night" };
		
		// Multiple change expressions must be separated with comma not semicolon.
		// Having the syntax error corrected code would print "Downtown Day-Uptown Night-"
		for (int i = 0, j = 0; i < nycTourLoops.length && j < times.length; i++; j++) {
			System.out.print(nycTourLoops[i] + " " + times[j] + "-");
		}
	}

}

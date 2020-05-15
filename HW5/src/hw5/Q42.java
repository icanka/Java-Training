package hw5;

public class Q42 {

	public static void main(String[] args) {
		String[] nycTourLoops = new String[] { "Downtown", "Uptown", "Brooklyn" };
		String[] times = new String[] { "Day", "Night" };

		// Uses two variables to iterate, prints first two elements from the arrays.
		for (int i = 0, j = 0; i < nycTourLoops.length && j < times.length; i++, j++) {
			System.out.print(nycTourLoops[i] + " " + times[j] + "-");
		}
	}

}

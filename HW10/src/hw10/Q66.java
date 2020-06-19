package hw10;

public class Q66 {

	public static void main(String[] args) {
		String[] nycTourLoops = new String[] { "Downtown", "Uptown", "Brooklyn" };
		String[] times = new String[] { "Day", "Night" };
		for (int i = 0, j = 0; i < nycTourLoops.length; i++, j++)
			
			// nycTourLoops[i], since the length of the nycTourLoop array is based
			// upon in the condition is okay, but the times[j] causes outOfBounds
			// when the 'j' hit the 3. But before exception is thrown this iteration
			// runs 2 times. Third time is the charm.
			System.out.println(nycTourLoops[i] + " " + times[j]);

	}

}

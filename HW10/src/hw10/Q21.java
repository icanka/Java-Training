package hw10;

public class Q21 {

	public static void main(String[] args) {
		// Value 1 is passed to method.
		new Alligator().snap(Alligator.teeth);

		// Now value 2 is passed to method.
		new Alligator().snap(Alligator.teeth);
	}

	private static class Alligator {
		static int teeth;
		double scaleToughness;

		// Class variable teeth is incremented every time when an instance
		// of Alligator class is instantiated.
		public Alligator() {
			teeth++;
		}

		// Java is pass-by-value and the parameter teeth hides class variable teeth
		// inside the method body. Considering this, class variable is not decremented.
		public void snap(int teeth) {
			System.out.print(teeth + " ");
			teeth--;
		}
	}

}

package hw3;

public class Q42 {

	public static void main(String[] args) {

		final TestGame tester = new TestGame();

		// Roller decides the if statement so, 'up' is
		// printed.
		System.out.println(tester.runTest(false, true));

		System.out.println(tester.runTest(false, false));
		System.out.println(tester.runTest(true, true));
		System.out.println(tester.runTest(true, false));

	}

	public static class TestGame {
		public String runTest(boolean spinner, boolean roller) {

			// This is assignment operator not comparison
			// so roller is assigned to spinner and newly assigned
			// value is returned. So the rollers variable is the
			// enactor here.
			if (spinner = roller)
				return "up";
			else
				return roller ? "down" : "middle";

		}
	}

}

package hw4;

public class Q2 {

	public static void main(String[] args) {
		Frisbee frisbee = new Frisbee("Charlie");
		Frisbee frisbee2 = new Frisbee("Foxtrot");

		Frisbee.toss(frisbee, frisbee2);
		
		// Or we can do it manually
		
		Frisbee[] frisbeeArray = {frisbee, frisbee2};
		Frisbee.toss(frisbeeArray);

	}

	private static class Frisbee {

		private String name;

		public Frisbee(String name) {
			this.name = name;
		}

		private String getName() {
			return name;
		}

		// T... is only a syntactic sugar for a T[]
		// Frisbee... is just Frisbee[]
		private static void toss(Frisbee... frisbees) {

			// It is just an array.
			Frisbee[] frisbeeArray = frisbees;

			Frisbee first = frisbees[0];
			System.out.print(first.getName());
		}

	}

}

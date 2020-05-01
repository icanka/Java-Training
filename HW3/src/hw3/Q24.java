package hw3;

public class Q24 {

	public static void main(String[] args) {
		int flavor = 30;
		int eaten = 0;

		switch (flavor) {
		// eaten gets incremented by 1.
		// since there is no break statement in any of the statements all the below
		// branches including default gets executed.
		case 30:
			eaten++;
			System.out.println("First case statement branched.");
		case 40:
			eaten += 2;
			System.out.println("Case statement branched.");
		default:
			eaten--;
			System.out.println("default statement branched.");
		}

		System.out.print(eaten);
	}

}

package hw5;

public class Q47 {

	public static void main(String[] args) {
		String tie = null;
		// While statement is terminated early, resulting in an infinite loop.
		while (tie == null)
			;
		tie = "shoelace";
		System.out.println(tie);
	}

}

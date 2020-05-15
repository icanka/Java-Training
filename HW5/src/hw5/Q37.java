package hw5;

public class Q37 {

	public static void main(String[] args) {
		String race = "";
		// label is present but the loop is missing
		loop:

		race += "x";
		break loop;

		System.out.println(race);
	}

}

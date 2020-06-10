package hw9;

public class Q18 {

	public static void main(String[] args) {
		String teams = new String("694");

		// These three lines of code does not change
		// the object actually. They are returning new
		// String objects.
		teams.concat(" 1155");
		teams.concat(" 2265");
		teams.concat(" 2869");

		// So this statement prints the unchanged teams String
		// which is "694"
		System.out.println(teams);

	}

}

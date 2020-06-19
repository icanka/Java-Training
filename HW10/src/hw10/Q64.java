package hw10;

public class Q64 {

	static String shoe1 = new String("sandal");
	static String shoe2 = new String("flip flop");

	// shoe2 object is lost because shoe2 variable is reassigned with shoe1
	// reference
	// shoe3 object is saved from garbage collection by being assigned to shoe1.
	// only object which is eligible for collection is the one which was being
	// referred by shoe2 variable originally.
	public static void shopping() {
		String shoe3 = new String("croc");
		shoe2 = shoe1;
		shoe1 = shoe3;
	}

	public static void main(String[] args) {
		shopping();
	}

}

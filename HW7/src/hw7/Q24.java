package hw7;

public class Q24 {

	public static void main(String[] args) {

		System.out.println(((Planet) new Mars()).getName());

	}

	private static interface Sphere {
		default String getName() {
			return "Unknown";
		}
	}

	private static abstract class Planet {
		abstract String getName();
	}

	// A class can not extend an interface, and cannot implement a class, vice
	// versa.
	// Other than that this class correctly overrides the getName method.
	public static class Mars extends Sphere implements Planet {
		public Mars() {
			super();
		}

		public String getName() {
			return "Mars";
		}
	}

}

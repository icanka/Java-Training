package hw8;

public class Q28 {
	public static void main(String[] args) {

		System.out.print(Stranger.getFullName("Joyce", "Hopper"));

	}

	private static class Stranger {
		private static String getFullName(String firstName, String lastName) {
			try {
				return firstName.toString() + " " + lastName.toString();
			} finally {
				System.out.print("Finished!");
				
			// Catch and finally cannot be interchangeably placed
			// If the order is reversed than the code would output
			// "Finished!Joy Hopper"
			} catch (NullPointerException e) {
				System.out.print("Problem?");
			}
			
			return null;
		}
	}
}

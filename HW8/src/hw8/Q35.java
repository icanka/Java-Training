package hw8;

public class Q35 {

	public static void main(String[] args) {

		String street = null;
		String city = "New York";

		System.out.print(new Address().getAddress(street, city));

	}

	private static class Address {
		public String getAddress(String street, String city) {
			try {
				return street.toString() + " : " + city.toString();
			} finally {
				System.out.print("Posted:");
			}
		}
	}

}

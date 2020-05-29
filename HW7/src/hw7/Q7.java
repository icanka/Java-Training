package hw7;

public class Q7 {

	public static void main(String[] args) {
		final Car car = new ElectricCar();

		// Even though the reference type variable is Car type
		// the polymorphic method from ElectricCar class is invoked.
		System.out.println(car.drive());
	}

	private static class Automobile {
		// This method is not inherited because it is private.
		private final String drive() {
			return "Driving vehicle";
		}
	}

	private static class Car extends Automobile {
		protected String drive() {
			return "Driving car";
		}
	}

	private static class ElectricCar extends Car {
		// Overrides the drive method from parent class
		public final String drive() {
			return "Driving electric car";
		}
	}

}

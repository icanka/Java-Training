package hw7;

public class Q27 {

	public static void main(String[] args) {
		new BlueCar();
	}

	private static class BlueCar extends Car {

		{
			System.out.print("4");
		}

		public BlueCar() {
			super("blue");
			System.out.print("5");
		}

	}

	private static abstract class Car {
		static {
			System.out.print("1");
		}

		public Car(String name) {
			super();
			System.out.print("2");
		}

		{
			System.out.print("3");
		}
	}

}

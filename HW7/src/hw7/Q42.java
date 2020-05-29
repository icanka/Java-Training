package hw7;

public class Q42 {
	public static void main(String[] args) {
		new Zoologist().setAnimal(null);
	}

	private static class Canine {
	}

	private static class Dog extends Canine {
	}

	private static class Wolf extends Canine {
	}

	private static final class Husky extends Dog {
	}

	private static class Zoologist {
		Canine animal;

		// Can't pass a Wolf type as argument.
		public final void setAnimal(Dog animal) {
			this.animal = animal;
		}
	}
}

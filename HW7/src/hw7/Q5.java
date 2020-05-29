package hw7;

public class Q5 {

	private static interface Pet {
	}

	private static class Canine implements Pet {

		// Cannot convert from Canine to Class
		// Class is not a supertype of Canine.
		public Class getDoggy() {
			return this;
		}
	}

}

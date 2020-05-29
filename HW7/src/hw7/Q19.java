package hw7;

public class Q19 {

	private static interface Horn {
		public Integer play();
	}

	private static abstract class Woodwind {
		public Short play() {
			return 3;
		}
	}

	private static final class Saxophone extends Woodwind implements Horn {

		// There is no type that would comfort the both overridden methods'
		// return types.
		public Number play() {
			return (short) 1;
		}
	}

}

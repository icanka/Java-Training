package hw10;

public class Q79 {

	private static abstract class Bear {
		protected int sing;

		protected abstract int grunt();

		int sing() {
			return sing;
		}
	}

	private static abstract class PolarBear extends Bear {

		// Cannot reduce the visibility of the overridden method.
		int grunt() {

			// lefth-hand side is not an variable.
			sing() += 10;

			// There two return statements, which is an error.
			// also cannot call super.grunt() since it is unimplemented.
			return super.grunt() + 1;
			return 10;
		}
	}

}

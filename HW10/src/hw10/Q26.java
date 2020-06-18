package hw10;

public class Q26 {

	public static void main(String[] args) {
		Plant p = new Tree(); // m2
		System.out.println(((Living) p).grow());
	}

	private static interface Plant {
		default String grow() {
			return "Grow!";
		}
	}

	private static interface Living {
		public default String grow() {
			return "Growing!";
		}
	}

	// We need to override, duplicate default grow() method causes ambiguity.
	public static class Tree implements Plant, Living { // m1

		// This is not overriding, but overloading.
		public String grow(int height) {
			return "Super Growing!";
		}
	}

}

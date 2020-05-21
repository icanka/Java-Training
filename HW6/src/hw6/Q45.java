package hw6;

public class Q45 {

	public static void main(String[] args) {

	}

	private static class Forest {
		public long treeCount;

		public Forest(long treeCount) {
			this.treeCount = treeCount + 2;
		}
	}

	private static class RainForest extends Forest {

		// Java implements a call to super() as the first line,
		// but there is no no-arguments constructor in the parent.
		// So we need to explicitly call a constructor from parent.
		public RainForest(long treeCount) {
			this.treeCount = treeCount + 1;
		}
	}

}

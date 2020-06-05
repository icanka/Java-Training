package hw8;

public class Q40 {
	public static void main(String[] args) {

		try {
			new Coat().zipper();
			System.out.print("Finished!");
		} catch (Throwable t) {
		}
	}

	private static class Coat {
		public Long zipper() throws Exception {
			try {
				String checkZipper = (String) new Object();
			} catch (Exception e) {
				// absent new keyword causes compilation error.
				throw new RuntimeException("Broken");
			}
			return null;
		}
	}
}

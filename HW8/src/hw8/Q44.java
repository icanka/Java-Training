package hw8;

public class Q44 {
	public static void main(String[] args) throws Exception {
		new Lair().openDrawbridge(); // r3
	}

	private static class Lair {
		public void openDrawbridge() throws Exception { // r1
			try {
				throw new Exception("This Exception");
			} catch (RuntimeException e) {
				throw new DragonException(); // r2
			} finally {
				throw new RuntimeException("Or maybe this one");
			}
		}
	}

	private static class DragonException extends Exception {
	}
}

package hw8;

public class Q22 {
	public static void main(String[] args) {

		new Citadel().openDrawbridge(); // q3

	}

	private static class Citadel {
		public void openDrawbridge() throws RuntimeException { // q1

			try {
				throw new KnightAttackingException();
			} catch (Exception e) {
				throw new Exception();
			} finally {
				// Does not compile, because we have an unhandled checked
				// exception here.
				throw new CastleUnderSiegeException(); // q2
			}
		}
	}

	private static class CastleUnderSiegeException extends Exception {
	}

	private static class KnightAttackingException extends CastleUnderSiegeException {
	}
}

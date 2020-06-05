package hw8;

public class Q46 {
	public static void main(String[] args) {
		try {
			throw new BiggerProblem();
		} catch (BiggerProblem re) {
			System.out.print("Problem?");
		} catch (Problem e) {
			System.out.print("Handled");
		} finally {
			System.out.print("Fixed!");
		}
	}

	// RuntimeException is a class not an interface.
	// it should be extended not implemented.
	private static class Problem extends RuntimeException {
	}

	private static class BiggerProblem extends Problem {
	}
}

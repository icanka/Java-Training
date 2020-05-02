package hw3;

public class Q9 {

	public static void main(String[] args) {
		new Election().calculateResult(null, 203);
	}

	private static class Election {
		public void calculateResult(Integer candidateA, Integer candidateB) {

			boolean process = candidateA == null || candidateA.intValue() < 10;

			/*
			 * The && operator is undefined for the type Integer We can use logical operator
			 * & instead of the shot-circuit version but then the returned value from the
			 * operator causes type mismatch.
			 */
			boolean value = candidateA & candidateB;
			System.out.print(process || value);
		}
	}

}

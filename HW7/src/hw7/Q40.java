package hw7;

public class Q40 {
	public static void main(String[] args) {
		Math math = new InfiniteMath();
		System.out.println(math.secret);
	}

	private static class Math {
		public final double secret = 2;
	}

	private static class ComplexMath extends Math {
		public final double secret = 4;
	}

	private static class InfiniteMath extends ComplexMath {
		public final double secret = 8;
	}
}

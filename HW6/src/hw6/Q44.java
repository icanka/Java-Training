package hw6;

public class Q44 {
	public final static long numberOfTrees;
	public final double height;
	static {
	}
	{
		final int initHeight = 2;
		height = initHeight;
	}
	static {
		numberOfTrees = 100;

		// Trying to reference instance variable in a static context.
		height = 4;
	}
}

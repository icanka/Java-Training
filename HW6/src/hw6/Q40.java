package hw6;

public class Q40 {
	public static void water() {
	}

	public void get() {
		this.water();
		water();
		Q40.water();

		// no such thing
		this.Q40.water();
	}

}

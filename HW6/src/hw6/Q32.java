package hw6;

public class Q32 {

	private int inThe = 4;

	// Can only call super() from a constructor
	// and this is not a constructor.
	public void Q32() {
		super();
	}

	public Q32(int inThe) {
		// Pointless assignment. But compiles anyway.
		this.inThe = this.inThe;
	}

	public static void main(String[] args) {
		System.out.print(new hw6.Q32(2).inThe + "asdasssdfgd");

	}
}

package hw10;

public class Q29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Big {
	public Big(boolean stillIn) {
		super();
	}
}

class Trouble extends Big {

	// no default Big() constructor is define so, we need to expilictly invoke
	// another constructor.
	public Trouble() {
	};

	public Trouble(int deep) {
		super(false);
		// this(); // constructor call must be a first statement in a constructor.
	}

	public Trouble(String now, int... deep) {
		this(3);
	}

	public Trouble(long deep) {

		// There is no constructor with a signature Trouble(String, long)
		this("check", deep);
	}

	public Trouble(double test) {
		super(test > 5 ? true : false);
	}
}

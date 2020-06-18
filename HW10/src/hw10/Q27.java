package hw10;

public class Q27 {
	public static void main(String[] args) {

		// All of the declarations are valid,
		String name = "Desiree";
		int _number = 694;

		// Local variables won't get initialized with default values like class or
		// member variables.
		boolean profit$$$;

		// Because of the profit$$$ variable, below statement does not compile.
		System.out.println(name + " won. " + _number + " profit? " + profit$$$);
	}
}

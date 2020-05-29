package hw7;

public class Q44 {

	public static void main(String[] args) {
		System.out.println("Hello World!");

	}

	private static abstract class House {
		protected abstract Object getSpace();
	}

	private static abstract class Room extends House {
		// This is not an override. This is an abstract overloading method.
		// a class that extends this Room class would have to implement
		// both getSpace() methods. Consider the below ImplClass.
		abstract Object getSpace(Object list);
	}

	private static abstract class Ballroom extends House {
		protected abstract String getSpace();
	}

}

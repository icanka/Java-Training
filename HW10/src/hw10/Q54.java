package hw10;

public class Q54 {
	public static void main(String[] args) {
		Friend friend = new Dog();
		System.out.print(((Cat) friend).getName());
		System.out.print(((Dog) null).getName());
	}
}

interface Friend {
	// Abstract methods in interfaces cannot be protected.
	protected String getName();
}

class Cat implements Friend {

	// Cannot reduce visibility of a inherited method.
	String getName() {
		return "Kitty";
	}
}

class Dog implements Friend {

	// Still... cannot reduce visibility of inherited method,
	String getName() throws RuntimeException {
		return "Doggy";
	}
}
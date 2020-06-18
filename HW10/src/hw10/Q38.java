package hw10;

public class Q38 {

	public static void main(String[] args) {
		
		
		// Arrow used in the lambda is typed wrong, it should be '->'
		prepare(45, d => d > 5 || d < -5);              // k2
	}

	interface Target {
		boolean needToAim(double angle);
	}

	static void prepare(double angle, Target t) {
		boolean ready = t.needToAim(angle); // k1
		System.out.println(ready);
	}

}

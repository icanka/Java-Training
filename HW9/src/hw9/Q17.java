package hw9;

public class Q17 {
	public static void main(String...strings) {
		// Passes lambda that checks if the given parameter is above 5
		// or below -5, if one these condition are true 
		// needToAim returns true. In this case it actually return true
		// because 45 is passed to it, 45 is given as the parameter.
		// so 'd' is 45.
		prepare(45, d -> d > 5 || d < -5);           //k2
	}
	
	
	interface Target {
		boolean needToAim(double angle);
	}
	
	static void prepare(double angle, Target t) {
		boolean ready = t.needToAim(angle);          //k1
		System.out.println(ready);
	}
}

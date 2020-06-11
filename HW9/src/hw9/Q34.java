package hw9;

import java.util.function.Predicate;

public class Q34 {

	public static void main(String[] args) {
		
		// Predicate is raw type, compiler can not infer the type.
		// It is understood that the lambda assumes the arguments type as String
		// but the compiler can't infer it. So it is treat as type Object.
		// and since the equals() method is a Object class member method
		// this code compiles fine and prints false since 
		Predicate clear = c -> c.equals("clear");
		System.out.println(clear.test("pink"));
	}

}

package hw9;

import java.util.ArrayList;
import java.util.List;

public class Q5 {

	public static void main(String[] args) {
		
		// ArrayList is a List, since it implements it.
		List frisbees = new ArrayList();
		
		// An object is not an List. Object does not
		// implement the List interface.
		List frisbees1 = new Object();
		
		// We could try to cast to make it compile,
		// altough it would throw a ClassCastException.
		List frisbees1 = (List) new Object();
		
		// Can't Instantiate an interface.
		List frisbees = new List();
	}

}

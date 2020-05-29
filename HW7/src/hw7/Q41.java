package hw7;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Q41 {
	private static class Math {
		
		protected Object dance() throws IOException {
			return "hello";
		}
	}

	
	
	private static class ComplexMath extends Math {
		
		// Valid override example.
		public final String dance() throws FileNotFoundException {
			return "hello overridden";
		}
	}
}

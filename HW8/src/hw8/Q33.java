package hw8;

public class Q33 {

	public static void main(String[] args) {
		final Object exception = new Exception();
		
		// Cannot cast because object is a more broader type object
		final Exception data = (RuntimeException) exception;
		System.out.print(data);
	}

}

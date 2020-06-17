package hw10;

public class Q17 {

	public static void main(String[] args) {

		// Since the reference variable's type is Fish
		// even though the Clownfish's getFish does not
		// declare an exception, we still need to declare or handle it.
		final Fish f = new Clownfish();
		f.getFish();
		System.out.println("swim!");
		
	}

	
	
	private static class BubbleException extends Exception {
	}

	private static class Fish {
		Fish getFish() throws BubbleException {
			throw new RuntimeException("fish!");
		}
	}
	
	private static class Clownfish extends Fish{
		public final Clownfish getFish() {
			throw new RuntimeException("clown!");
		}
	}

}

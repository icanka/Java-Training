package hw8;

public class Q17 {

	public static void main(String[] args) throws Exception {
		try {
			
			
			System.out.print(new Boat().travel());
			
		// catch block does not use brackets, it uses parentheses.
		// hence this code does not compile due to that syntax error.
		}catch(Exception e) (
			System.out.print(8);
		)
		
	}

	private static class Boat {
		public int travel() throws Exception {
			return 4;
		} // j1
	}

	private static class Transport {
		public int travel() throws CapsizedException {
			return 2;
		}
	}

	private static class CapsizedException extends Exception {
	}

}

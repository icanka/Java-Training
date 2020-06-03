package hw8;

public class Q20 {

	private static class GasException extends Exception {
	}

	private static class Element {
		public int getSymbol() throws GasException {
			return -1;
		} // g1
	}

	private static class Oxygen extends Element {
		public int getSymbol() {
			return 8;
		} // g2

		public void printData() {
			try {
				System.out.print(getSymbol());
				
			// Missing parentheses and exception type inside it 
			// to be catched.
			} catch {                                            //g3
				System.out.print("Unable to read data");
			}
		}
	}

}

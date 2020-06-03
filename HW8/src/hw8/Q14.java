package hw8;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Q14 {

	public static void main(String[] args) {
		new Printer().print();
	}

	private static class Printer {
		private void print() {
			try {
				throw new FileNotFoundException();
			} catch (IOException exception) {
				System.out.print("Z");

				// This catch block is unreachable since the upper
				// catch block already handles all the exceptions
				// including this type of exception.
			} catch (FileNotFoundException enfe) {
				System.out.print("X");
			} finally {
				System.out.print("Y");
			}
		}
	}

}

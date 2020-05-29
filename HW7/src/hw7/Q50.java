package hw7;

import java.io.*;

public class Q50 {

	public static void main(String[] args) throws IOException {

		Machine machine = new Robot();
		System.out.println(machine.turnOn());
	}

	private static class Machine {
		public boolean turnOn() throws EOFException {
			return true;
		}
	}

	private static class Robot extends Machine {
		public boolean turnOn() throws IOException {
			return false;
		}
	}

}

package hw8;

public class Q18 {

	private static class PrintException extends Exception {
	}

	private static class PaperPrintException extends PrintException {
	}

	private static interface Printer {
		abstract int printData() throws PrintException;
	}

	private static class ImplementerClass implements Printer {

		// This signature is allowed since it throws a more
		// specific type

		public int printData() throws PaperPrintException {
			return 1;
		}

	}

	private static class ImplementerClass2 implements Printer {

		// This signature is allowed too, since overriding
		// class is allowed to not declare any exceptions
		public int printData() {
			return 1;
		}

	}

	private static class ImplementerClass3 implements Printer {

		// This signature is no allowed since overriding
		// method cannot throw a broader type exception.
		public int printData() throws Exception {
			return 1;
		}

	}

}

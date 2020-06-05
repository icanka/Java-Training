package hw8;

public class Q49 {
	public static void main(String[] args) {

		new Backup().performBackup(); // z2

	}

	private static class Backup {
		public void performBackup() {

			try {
				throw new IOException("Disk not found");
			} catch (Exception e) {

				try {
					throw new FileNotFoundException("File not found.");

					// Duplicate parameter, code does not compile.
				} catch (FileNotFoundException ef) { // z1
					System.out.print("Failed");
					;
				}

			}

		}

	}
}

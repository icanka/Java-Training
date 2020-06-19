package hw10;

public class Q71 {

	public static void main(String[] args) {

		// Checked exceptions must be declared or handles.
		new Q71().openDrawbridge();
	}

	public void openDrawbridge() throws Exception {
		try {
			throw new Exception("Problem");
		} catch (OpenDoorException e) {
			throw new OpenDoorException();

			// Narrower exception must be catched earlier.
		} catch (CableSnapException ex) {
			try {
				throw new OpenDoorException();

				// Duplicate parameter
			} catch (Exception ex) {

			} finally {
				System.out.println("Almost done");
			}
		} finally {
			throw new RuntimeException("Unending problem");
		}
	}

	class OpenDoorException extends Exception {
	}

	class CableSnapException extends OpenDoorException {
	}

}

package hw8;

public class Q25 {
	public static void main(String[] args) {

		new Attendance().printTodayCount();

	}

	private static class Attendance {

		// this list causes the method to throw ArrayIndexOutOfBoundsException
		private Boolean[] list = { false, true }; // value omitted

		// list = null causes a NullPointerException
		// list = (Boolean[]) new Object() causes ClassCastException

		public int printTodayCount() {
			int count = 0;
			for (int i = 0; i < 10; i++) {
				if (list[i])
					++count;
			}
			return count;
		}

	}
}

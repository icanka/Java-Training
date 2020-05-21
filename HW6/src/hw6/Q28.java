package hw6;

public class Q28 {

	public static void main(String[] args) {
		Gift gift = new Gift();
		gift.setContents(gift);
		gift.showPresent();
	}

	private static class Gift {
		private final Object contents;

		protected Object getContents() {
			return contents;
		}

		// final variables cannot be reassigned once initialized.
		protected void setContents(Object contents) {
			this.contents = contents;
		}

		public void showPresent() {
			System.out.print("Your gift: " + contents);
		}
	}

}

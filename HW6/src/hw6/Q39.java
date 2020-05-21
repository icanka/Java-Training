package hw6;

public class Q39 {

	public static void main(String[] args) {
		final Phone phone = new Phone(3);
		Phone.sendHome(phone, 7);
		System.out.print(phone.size);
	}

	private static class Phone {
		private int size;

		public Phone(int size) {
			this.size = size;
		}

		public static void sendHome(Phone p, int newSize) {

			// copy reference to object is assigned to a newly
			// created object, so it is no more pointing to
			// the passed object.
			p = new Phone(newSize);
			p.size = 4;
		}
	}

}

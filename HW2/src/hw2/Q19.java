package hw2;

public class Q19 {

	private static class Link {

		private String name;
		private Link next;

		public Link(String name, Link next) {
			this.name = name;
			this.next = next;
		}

		private void setNext(Link next) {
			this.next = next;
		}

		private Link getNext() {
			return next;
		}
	}

	public static void main(String... strings) {
		Link link1 = new Link("x", null);
		Link link2 = new Link("y", link1);
		Link link3 = new Link("z", link2);

		link2.setNext(link3);
		link3.setNext(link2);

		link1 = null;
		link3 = null;

		System.out.println("Program terminated.");

	}

}

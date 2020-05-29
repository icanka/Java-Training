package hw7;

public class Q29 {

	public static void main(String[] args) {

		// Although get() method return a reference type of Ball, the object it points
		// to
		// is an SoccerBall, so that reference can be safely casted to Equipment.

		Equipment equipment = (Equipment) (Ball) new SoccerBall().get();
		System.out.print(((SoccerBall) equipment).size);

	}

	private static abstract class Ball {
		protected final int size;

		public Ball(int size) {
			this.size = size;
		}
	}

	private static interface Equipment {
	}

	private static class SoccerBall extends Ball implements Equipment {
		public SoccerBall() {
			super(5);
		}

		public Ball get() {
			return this;
		}
	}

}

package hw10;

public class Q69 {

	public static void main(String[] args) {
		MakesNoise mn = new Drum();

		// MakesNoise interface does not define any method such as concert.
		mn.concert();
	}

	private static interface MakesNoise {
	}

	private static abstract class Instrument implements MakesNoise {
		public Instrument(int beats) {
		}

		public void play() {
		}
	}

	// Impilicit super constructor is undefined, cannot insert a default
	// constructor.
	private static class Drum extends Instrument {
		public void play(int count) {
		}

		public void concert() {
			// play does not take any parameter.
			super.play(5);
		}
	}

}

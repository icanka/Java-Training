package hw7;

public class Q48 {

	private static interface MusicCreator {
		public Number play();
	}

	private static class StringInstrument {
		public Long play() {
			return 3L;
		}
	}

	private static class Violin implements MusicCreator {
		// Must be a compatible return type with both of play() methods.
		public Long play() {
			return 3L;
		}
	}

}

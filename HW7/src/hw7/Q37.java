package hw7;

public class Q37 {
	public static void main(String... strings) {
		System.out.print(new Performance().talk(notes));
	}

	private static interface SpeakDialogue {
		default int talk() {
			return 7;
		}
	}

	private static interface SingMonologue {
		default int talk() {
			return 5;
		}
	}

	private static class Performance implements SpeakDialogue, SingMonologue {
		public int talk(String... x) {
			return x.length;
		}
	}
}

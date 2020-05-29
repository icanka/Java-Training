package hw7;

public class Q3 {

	public static void main(String[] args) {

		new Song().playMusic();

	}

	private static class Song {

		// Duplicate methods
		// Two methods with the same signature is not allowed.
		public void playMusic() {
			System.out.println("Play!");
		}

		private static int playMusic() {
			System.out.println("Music!");
		}

	}

}

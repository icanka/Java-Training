package hw8;

public class Q38 {

	public static void main(String[] args) throws Exception {
		try {
			new Heart().operate();
		} finally {

		}
	}

	private static class Organ {
		public void operate() throws RuntimeException {
			throw new RuntimeException("Not supperted");
		}
	}

	private static class Heart extends Organ {
		
		// Cannot throw an checked exception here 
		public void operate() throws Exception {
			System.out.println("Beat");
		}
	}

}

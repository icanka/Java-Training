package hw5;

public class Q25 {

	public static void main(String[] args) {
		int singer = 0;
		// Because singer is not bigger than 0, while block never gets executed.
		while (singer > 0)
			System.out.println(singer++);
	}

}

package hw5;

public class Q48 {

	public static void main(String[] args) {
		int result = 8;

		
		// We cannot use java keywords as labels for loops.
		for: 
			while (result > 7) {
			result++;

			do {
				result--;
			} while (result > 5);
			
			break for;
		}
		
		
		System.out.println(result);
	}

}

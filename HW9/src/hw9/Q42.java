package hw9;

public class Q42 {
	public static void main(String[] args) {

		// Creates a list that holds Integer values
		List<Integer> pennies = new ArrayList<>();
		// adds these 3 values to the list
		pennies.add(3);
		pennies.add(2);
		pennies.add(1);

		// remove the value at the index 2
		pennies.remove(2);

		// print the pennies List which is [3, 2]
		System.out.println(pennies);
	}
}

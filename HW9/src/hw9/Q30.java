package hw9;

public class Q30 {
	public static void main(String[] args) {
		String builder = "54312";

		// builder is assigned to substring starting from the index 4
		// which is the substring '2'
		builder = builder.substring(4);

		// There is no char value at the index 2, because builder's length is just 1
		// so the maximum available index is 0
		// This statement throws StringIndexOutOfBoundsException
		System.out.println(builder.charAt(2));
	}
}

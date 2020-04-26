package hw2;

public class Q7 {

	public static void main(String[] args) {

		int num0 = 999;
		int num1 = 9_9_9;

		float pi0 = 3.14_15F; // Valid

		// float pi1 = 3._1415F; // Invalid; Can not put adjacent to a decimal point in
		// a floating point literal
		// float pi2 = 3.1_415_F; // Invalid; Cannot put prior to an L or F suffix

		// int x5 = 0_x52; // Invalid; cannot put underscores in the 0x radix prefix
		// int x6 = 0x_52; // Invalid; cannot put underscores at the beginning of a number

		int num2 = _9_99; // Invalid; cannot put underscores at the beginning of a
		// number
		System.out.print(9__9);

	}

}

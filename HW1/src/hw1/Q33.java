package hw1;

public class Q33 {
	static int start = 2;
	final int end;
	
	public Q33(int x) {
		// Whatever we pass to the constructor, x is assigned to 4.
		x = 4;
		
		// So end is always have the value of 4.
		end = x;
	}
	
	public void fly(int distance) {
		
		// This always evaluates to 2, since start is 2 and
		// end is always 4
		System.out.print(end-start+" ");
		System.out.print(distance);
	}

	public static void main(String... start) {
		
		// Here 5 is given to fly method as parameter. So 5 is going to be printed.
		// Given 10 to the constructor does not effect the print. 
		new Q33(10).fly(5);

	}

}

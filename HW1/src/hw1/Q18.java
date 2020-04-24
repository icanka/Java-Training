package hw1;

public class Q18 {

	public static void main(String[] args) {
		
		String tree = "pine";
		int count = 0;
		
		if(tree.equals("pine")) {
			// height variable only exists in this block. It's not
			// accessible from outside of this code block.
			// cleared out of memory after this code block.
			int height = 55;
			count = count + 1;
		}
		
		// does not compile, causes error.
		System.out.println(height + count);

	}

}

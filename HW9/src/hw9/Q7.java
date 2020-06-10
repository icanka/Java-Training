package hw9;

public class Q7 {

	public static void main(String[] args) {
		
		// sb is yet to be initialized.
		StringBuilder sb = new StringBuilder("radical").insert(sb.length(), "robots");
		
		
		StringBuilder sb2 = new StringBuilder("radical");
		sb2.insert(sb2.length(), "robots");
		System.out.println(sb2);
	}

}

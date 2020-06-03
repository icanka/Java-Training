package hw8;

public class Q2 {
	public static void main(String[] args) {
		// The order of the keywords is not interchangeable 
		try {throw new RuntimeException();}
		catch(RuntimeException e) {}
		finally {}
		
		
		try {throw new RuntimeException();}
		finally(RuntimeException e) {}
		catch {}
	}
}

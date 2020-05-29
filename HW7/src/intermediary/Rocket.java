package intermediary;

public class Rocket extends Ship {
	public int weight = 2;
	public int height = 4;

	public void printDetails() {
		// Cannot access private members of parent class.
		System.out.print(super.getWeight() + "," + super.height);
	}
	
	
	private static interface MyI{
		protected abstract void method();
	}
}

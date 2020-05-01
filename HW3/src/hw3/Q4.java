package hw3;

public class Q4 {

	public static void main(String[] args) {
		int plan = 1;
		
		// First plan is evaluated and then incremented 
		// plan = 1 + --plan ( plan is currently 2 in memory)
		// then it is decremented and evaluated, resulting:
		// plan = 1 + 1
		plan = plan++ + --plan;

		// Only one else may appear if-then-else statement
		// for additional if-then statements to an else block
		// we need to add 'else if(boolean expression)'
		
		if(plan==1) {
			System.out.print("Plan A");
		}else {if(plan==2) System.out.print("Plan B");
		}else System.out.print("Plan C");
		
		
	}

}

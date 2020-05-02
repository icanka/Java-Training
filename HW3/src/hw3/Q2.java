package hw3;

public class Q2 {

	public static void main(String[] args) {
		int meal = 5;
		int tip = 2;

		/*
		 * First, parentheses gets evaluated, because we are overriding the order of
		 * operation by wrapping parentheses around the sections we want evaluated
		 * first. Inside it, first pre-unary operators gets evaluated then comparision
		 * operator gets evaluated and then the ternary '?' operator gets evaluated as
		 * the order of operation states. after the parentheses evaluated it is added
		 * with meal variable and then assigned the result is assigned to the total
		 * variable.
		 */
		int total = meal + (meal > 6 ? ++tip : --tip);

		System.out.print(tip);
	}

}

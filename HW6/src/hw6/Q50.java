package hw6;

import commerce.Bank.*;

public class Q50 {

	public void processAmount(int depositSlip, int withdrawalSlip) {

		// These are instance methods not static methods.
		// Cannot use them without an instance.
		withdrawal(withdrawalSlip);
		deposit(depositSlip);
	}

}

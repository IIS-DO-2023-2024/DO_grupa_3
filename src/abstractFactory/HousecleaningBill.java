package abstractFactory;

import simpleFactory.Bill;

public class HousecleaningBill implements Bill {

	@Override
	public void pay() {
		System.out.println("Housecleaning bill has been paid.");

	}

}

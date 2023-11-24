package abstractFactory;

import simpleFactory.Bill;

public class KindergartenBill implements Bill {

	@Override
	public void pay() {
		System.out.println("Kindergarten bill has been paid.");

	}

}

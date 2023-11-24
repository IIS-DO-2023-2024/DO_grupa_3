package abstractFactory;

import simpleFactory.Bill;

public class TaxBill implements Bill {

	@Override
	public void pay() {
		System.out.println("Tax bill has been paid.");

	}

}

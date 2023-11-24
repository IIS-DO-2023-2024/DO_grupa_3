package abstractFactory;

import simpleFactory.Bill;

public abstract class BillFactory {
	
	public abstract Bill createBill(String type);

}

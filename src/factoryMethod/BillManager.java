package factoryMethod;

import simpleFactory.Bill;

public abstract class BillManager {
	Bill bill;
	
	public void calculatedBill(String type) {
		bill = createBill(type);
		bill.pay();
	}
	
	public abstract Bill createBill(String type);

}

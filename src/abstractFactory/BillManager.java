package abstractFactory;

import simpleFactory.Bill;

public class BillManager {
	Bill bill;
	BillFactory billFactory;
	
	public BillManager(BillFactory billFactory) {
		this.billFactory = billFactory;
	}
	
	public void processBill(String type) {
		bill = billFactory.createBill(type);
		bill.pay();
	}

}

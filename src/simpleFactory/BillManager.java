package simpleFactory;

public class BillManager {
	Bill bill;
	BillFactory billFactory;
	
	public BillManager(BillFactory billFactory) {
		this.billFactory = billFactory;
	}
	
	public void processBill(String type) {
		bill = billFactory.createBill(type);
		bill.pay();
//		if(type.equals("electricity"))
//			bill = new ElectricityBill();
//		else if(type.equals("gas"))
//			bill = new GasBill();
//		else if(type.equals("utility"))
//			bill = new UtilityBill();
	}

}

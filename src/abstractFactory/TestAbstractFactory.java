package abstractFactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		WorkBillFactory billFactory = new WorkBillFactory();
		BillManager billManager = new BillManager(billFactory);
		
		billManager.processBill("vat");

	}

}

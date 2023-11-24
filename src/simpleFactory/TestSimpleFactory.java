package simpleFactory;

public class TestSimpleFactory {

	public static void main(String[] args) {
		BillFactory billFactory = new BillFactory();
		BillManager billManager = new BillManager(billFactory);
		
		billManager.processBill("electricity");

	}

}

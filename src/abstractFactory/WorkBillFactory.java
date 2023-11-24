package abstractFactory;

import simpleFactory.Bill;

public class WorkBillFactory extends BillFactory{

	@Override
	public Bill createBill(String type) {
		if(type.equals("vat"))
			return new VatBill();
		else if(type.equals("tax"))
			return new TaxBill();
		else
			return null;
	}

}

package abstractFactory;

import simpleFactory.Bill;

public class HomeBillFactory extends BillFactory {

	@Override
	public Bill createBill(String type) {
		if(type.equals("kindergarten"))
			return new KindergartenBill();
		else if (type.equals("homecleaning"))
			return new HousecleaningBill();
		else
			return null;
	}
	

}

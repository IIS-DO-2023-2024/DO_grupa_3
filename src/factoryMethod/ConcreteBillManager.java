package factoryMethod;

import simpleFactory.Bill;
import simpleFactory.ElectricityBill;
import simpleFactory.GasBill;
import simpleFactory.UtilityBill;

public class ConcreteBillManager extends BillManager {

	@Override
	public Bill createBill(String type) {
		if(type.equals("electricity"))
			return new ElectricityBill();
		else if(type.equals("gas"))
			return new GasBill();
		else if(type.equals("utility"))
			return new UtilityBill();
		else 
			return null;
	}

}

package simpleFactory;

public class ElectricityBill implements Bill {

	@Override
	public void pay() {
		System.out.println("Electricity bill has been paid.");

	}

}

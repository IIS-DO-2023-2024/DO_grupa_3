package simpleFactory;

public class UtilityBill implements Bill {

	@Override
	public void pay() {
		System.out.println("Utility bill has been paid.");

	}

}

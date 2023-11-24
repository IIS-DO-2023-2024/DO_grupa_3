package simpleFactory;

public class GasBill implements Bill {

	@Override
	public void pay() {
		System.out.println("Gas bill has been paid.");

	}

}

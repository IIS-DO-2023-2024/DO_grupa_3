package factoryMethod;

public class TestFactoryMethod {

	public static void main(String[] args) {
		
		ConcreteBillManager billManager = new ConcreteBillManager();
		billManager.calculatedBill("gas");

	}

}

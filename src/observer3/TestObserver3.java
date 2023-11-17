package observer3;

public class TestObserver3 {

	public static void main(String[] args) {
		CryptoCurrencyPrice cp = new CryptoCurrencyPrice(); // support - observeable
		CryptoCurrencyUpdateSMS cSMS = new CryptoCurrencyUpdateSMS();  // listener - observer
		
		cp.addListener(cSMS);
		
		cp.setBitcoinPrice(75000);
		cp.setEtherPrice(45000);

	}

}

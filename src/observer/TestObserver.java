package observer;

public class TestObserver {

	public static void main(String[] args) {
		CryptoCurrencyPrice cp = new CryptoCurrencyPrice();
		CryptoCurrencyUpdateSMS cSMS = new CryptoCurrencyUpdateSMS();
		
		cp.addObserver(cSMS);
		
		cp.setBitcoinPrice(20000);
		cp.setEtherPrice(10000);
	}

}

package strategy;

public class TestStrategy {

	public static void main(String[] args) {
		ShoppingCart studentShoppingCart = new ShoppingCart(new StudentDiscount());
		ShoppingCart pensionersShoppingCart = new ShoppingCart(new PensionersDiscount());
		
		double amount = 100;
		System.out.println("Regularna cena je: " + amount + " RSD");
		
		double studentPrice = studentShoppingCart.calculateTotal(amount);
		System.out.println("Studentska cena je: " + studentPrice + " RSD");
		
		double pensionersPrice = pensionersShoppingCart.calculateTotal(amount);
		System.out.println("Penzionerska cena je: " + pensionersPrice + " RSD");
		
		// BuffredWriter - klasa u Java jeziku koja omogućava pisanje podataka u tok podataka (stream); upis u teksutalnu datoteku (.txt)
		// ObjectOutputStrema - klasa u Java jeziku koja omogućavanje pisanje objekata u tok podataka (stream); kreiranje crteža (.bin)

	}

}

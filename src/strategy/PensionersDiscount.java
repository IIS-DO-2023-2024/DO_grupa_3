package strategy;

public class PensionersDiscount implements DiscountStrategy {

	@Override
	public double applyDiscount(double amount) {
		return amount * 0.25; // 25%
	}

}

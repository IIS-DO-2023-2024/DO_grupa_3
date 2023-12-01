package strategy;

public class StudentDiscount implements DiscountStrategy {

	@Override
	public double applyDiscount(double amount) {
		return amount * 0.1; // 10% 
	}

}

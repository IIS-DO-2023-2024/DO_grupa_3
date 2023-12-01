package strategy;

public class ShoppingCart {
	private DiscountStrategy discountStrategy;
	
	public ShoppingCart(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}
	
	public double calculateTotal(double amount) {
		double discountedAmount = amount - discountStrategy.applyDiscount(amount);
		return discountedAmount;
	}

}

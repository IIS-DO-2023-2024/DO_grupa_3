package builder1;

public interface PizzaBuilder {

	public void putDough();
	public void putSauce();
	public void putCheese();
	public void putMeat();
	public Pizza getPizza();
}

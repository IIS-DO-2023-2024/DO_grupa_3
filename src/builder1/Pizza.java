package builder1;

public class Pizza {
	
	private String dough;
	private String sauce;
	private String cheese;
	private String meat;
	
	public void setDough(String dough) {
		this.dough = dough;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	
	@Override
	public String toString() {
		return "Pizza [dough=" + dough + ", sauce=" + sauce + ", cheese=" + cheese + ", meat=" + meat + "]";
	}
	

}

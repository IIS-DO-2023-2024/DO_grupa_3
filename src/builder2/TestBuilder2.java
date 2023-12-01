package builder2;

public class TestBuilder2 {

	public static void main(String[] args) {
		Sandwich.Builder builder = new Sandwich.Builder("Integralna");
		
		builder.meat("Šunka").salad("Zelena").spread("Urnebes").spread("Majonez").spread("Pavlaka");
		
		Sandwich sandwich = builder.build();
		System.out.println(sandwich);
		
		//kraći zapis
		Sandwich.Builder builder2 = new Sandwich.Builder("Bela kifla");
		Sandwich sandwich2 = builder2.meat("kulen").meat("pečenica").salad("paradajz").salad("kupus").spread("kečap").build();
		System.out.println(sandwich2);
				

	}

}

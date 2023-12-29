package generics;

public class Test {

	public static void main(String[] args) {
		var list = new List();
		list.add(1);
		list.add("1");
		list.add(new User());
		
		System.out.println(list.get(0));
		int number = (int)list.get(0); //Bez kastovanja izbacivalo grešku da nije moguća konverzija iz Object u int
		
//		new GenericList<String>();
//		new GenericList<Integer>();
//		new GenericList<User>();
		

		//Prednost što se čuva u izvornom obliku
		var list2 = new GenericList<Integer>();
		list2.add(1); // Boxing (int -> Integer)
		int number_list2 = list2.get(0); //Unboxing (Integer -> int)
		// Wrapper klasu: int -> Integer; float -> Float; boolean -> Boolean
		
		
		// Testiranje generičkih metoda
		Utils.max1(1, 2); // samo int
		Utils.max2(1, 2); // dozvoljava int
		Utils.max2("String1", "String2"); //dozvoljava String
		
		
		// Testiranje generičke metode sa više parametara različitog tipa
		Utils.print(1, "Stefan");
		Utils.print("01", "Stefan");
	}

}
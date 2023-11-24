package prototype;

import java.awt.Color;

import mvc.Point;

public class TestPrototype {

	public static void main(String[] args) {
		
		//---- Testiranje shallow copy načina kreiranja prototipa -----
		Point p1 = new Point(10, 10, Color.BLACK);
		Point p2 = new Point(20, 20, Color.BLACK);
		
		LineShallow l1 = new LineShallow(p1, p2, Color.BLACK);
		LineShallow l2 = l1.clone();
		
		System.out.println(l1);
		System.out.println(l2);
		
		l1.getStartPoint().setX(500);
		System.out.println(l1); // ---> 500, 10
		System.out.println(l2); // ---> 500, 10
		
		
		//---- Testiranje deep copy načina kreiranja prototipa -----
		Point p3 = new Point(50, 50, Color.BLACK);
		Point p4 = new Point(60, 60, Color.BLACK);
		
		LineDeep l3 = new LineDeep(p3, p4, Color.BLACK);
		LineDeep l4 = l3.clone();

		System.out.println("------------");
		System.out.println(l3);
		System.out.println(l4);
		
		l3.getStartPoint().setX(50000);
		System.out.println(l3); // ---> 50000, 50
		System.out.println(l4); // ---> 50, 50
		

	}

}

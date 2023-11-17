package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import composite.SremBanatBacka;

public class DrawingController {
	
	DrawingModel model;
	DrawingFrame frame;
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		this.model = model;
		this.frame = frame;
	}

	public void mouseClicked(MouseEvent e) {
		// MVC materijal
		
//		Point p = new Point(e.getX(), e.getY(), Color.RED);
//		model.add(p);
//		frame.repaint();
//		//System.out.println(System.currentTimeMillis());
		
		
		
		// Composite materijal
		SremBanatBacka vojvodina = new SremBanatBacka();
		Point srem = new Point(20, 20, Color.BLUE);
		Point backa = new Point(25, 12, Color.BLUE);
		Point banat = new Point(30, 20, Color.BLUE);
		
		vojvodina.add(srem);
		vojvodina.add(banat);
		vojvodina.add(backa);
		
		model.add(vojvodina);
		
		frame.repaint();
	}

}
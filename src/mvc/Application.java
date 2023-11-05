package mvc;

import javax.swing.JFrame;

public class Application {

	public static void main(String[] args) {
		System.out.println("Dizajnerski obrasci - Vežbe - grupa 3");
		
		//realizacija mvc arhitekture
		DrawingModel model = new DrawingModel();
		DrawingFrame frame = new DrawingFrame();
		frame.getView().setModel(model);
		DrawingController controller = new DrawingController(model, frame);
		frame.setController(controller);
		
		//frame
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
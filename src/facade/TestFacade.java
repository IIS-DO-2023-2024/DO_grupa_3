package facade;

public class TestFacade {

	public static void main(String[] args) {
		Car car = new Car();
		
		CarFacade carFacade = new CarFacade(car, 1234, "šara");
		
		System.out.println(carFacade.startTheCar());
		
		car.setRaining(true);

		CarFacade carFacade2 = new CarFacade(car, 1234, "šara");
		System.out.println(carFacade2.startTheCar());
	}

}
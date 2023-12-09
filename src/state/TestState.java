package state;

public class TestState {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.turnOff();
		car.turnOn();
		car.move();
		car.goIdle();
		car.turnOff();
		car.move();
		car.turnOn();
		car.move();
		car.turnOff();

	}

}

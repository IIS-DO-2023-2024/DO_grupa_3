package state;

public class IdleState implements CarBehavior {
	private Car car;
	
	public IdleState(Car car) {
		this.car = car;
	}

	@Override
	public void turnOn() {
		System.out.println("Car is already turned on.");
	}

	@Override
	public void turnOff() {
		car.setCurrentState(car.getTurnedOffState());
		System.out.println("Car is now turned off.");
	}

	@Override
	public void goIdle() {
		System.out.println("Car is already idle.");
	}

	@Override
	public void move() {
		car.setCurrentState(car.getMovingState());
		System.out.println("Car is now moving.");
	}

}

package facade;

public class Unlock {
	private Car car;
	private int remoteCode; //kod za otkljucavanje alarma
	private String message; //da nas obavesti šta se dešava kad testiramo
	
	public Unlock(Car car, int remoteCode) {
		this.car = car;
		this.remoteCode = remoteCode;
	}
	
	public String getMessage() {
		return message;
	}
	
	public boolean unlockTheCar() {
		if(car.getRemoteCode() == remoteCode){
			message = "Car is now unlocked.";
			return true;
		} else {
			message = "Wrong remote.";
			return false;
		}
	}
	
}
package facade;

public class Car {
	private int remoteCode = 1234;
	private String carKey = "šara";
	private boolean isRaining = false;
	private boolean previousState = true;
	
	public int getRemoteCode() {
		return remoteCode;
	}
	
	public String getCarKey() {
		return carKey;
	}
	
	public boolean isRaining() {
		return isRaining;
	}
	
	public boolean isPreviousState() {
		return previousState;
	}

	public void setRaining(boolean isRaining) {
		this.isRaining = isRaining;
	}	
	
	

	
}
package demo;

public abstract class Vehicle {
	protected int passengers;
	protected String motor;
	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int i) {
		passengers = i;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String string) {
		motor = string;
	}
}

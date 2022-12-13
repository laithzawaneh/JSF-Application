package javacourse;

public class Bike implements Vehicle {

	int gear;
	int speed;

	@Override
	public void changeGear(int newGear) {
		gear = newGear;

	} 

	@Override
	public void speedUp(int increment) {
		speed += increment;

	}

	@Override
	public void applyBrake(int decrement) {
		speed -= decrement;

	}

	public void printState() {
		System.out.println("Bike: " + "Gear: " + gear + " speed:" + speed);
	}

}
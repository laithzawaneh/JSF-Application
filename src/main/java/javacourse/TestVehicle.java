package javacourse;

public class TestVehicle {

	public static void main(String[] args) {
		Bicycle bicycal= new Bicycle();
		Bike bike =new Bike();
		
		bicycal.changeGear(2);
		bicycal.speedUp(5);
		bicycal.applyBrake(1);
		bicycal.printState();
		
		bike.changeGear(3);
		bike.speedUp(10);
		bike.applyBrake(2);
		bike.printState();

	}

}

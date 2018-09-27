package ua.univer.vehichle;

public class CBatCar extends CAmphibiousCar implements Flyable{

	private double speedInMach;	
	
	public CBatCar(String veh, Location loc, int yearOfProduction, double price,
			      double speedInKph, double speedInKnot, double speedInMach) {
		super(veh, loc, yearOfProduction, price, speedInKph, speedInKnot);
		this.speedInMach = speedInMach;
	}

	public double getSpeedInMach() {
		return speedInMach;
	}

	public double getSpeed() {
		return speedInMach;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\tSpeed in Mach:\t\t" + speedInMach + "\n";
	}
	
}

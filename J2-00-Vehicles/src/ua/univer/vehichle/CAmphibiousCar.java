package ua.univer.vehichle;

public class CAmphibiousCar extends CCar implements Sailable{

	private double speedInKnot;
	
	public CAmphibiousCar(String veh, Location loc, int yearOfProduction,
						  double price, double speedInKph, double speedInKnot) {
		super(veh, loc, yearOfProduction, price, speedInKph);
		this.speedInKnot = speedInKnot;
	}

	public double getSpeedInKnot() {
		return speedInKnot;
	}
	
	public double getSpeed() {
		return speedInKnot;
	}	
	
	@Override
	public String toString() {
		return super.toString() + "\tSpeed in Knot:\t\t" + speedInKnot + "\n";
	}
	
}

package ua.univer.vehichle;

public class CPlane extends CVehicle implements Flyable{

	private int servCeiling, numPassengers;
	private double speedInMach;	
	
	public CPlane(String veh, Location loc, int yearOfProduction, double price,
			      int servCeiling, int numPassengers, double speedInMach) {
		super(veh, loc, yearOfProduction, price);
		this.servCeiling = servCeiling;
		this.numPassengers = numPassengers;
		this.speedInMach = speedInMach;	
	}

	public int getServCeiling() {
		return servCeiling;
	}

	public int getNumPassengers() {
		return numPassengers;
	}
	
	@Override
	public double speedInKph() {
		return 1234.8 * speedInMach;
	}
	
	public double getSpeed() {
		return speedInMach;
	}
	
	@Override
	public double priceInThndUSD() {
		return super.getPrice() * 1000;
	}	
	
	@Override // adjust
	public String toString() {
		return super.toString() +  "Price in USD mln:\t" + super.getPrice() + "\n\t" + "Speed in Mach:\t\t" + speedInMach + "\n\t"
				+ "Service Ceiling, m:\t" + servCeiling + "\n\t"  + "Number of Passengers:\t" + numPassengers + "\n";
	}

	
	
	
}

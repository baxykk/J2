package ua.univer.vehichle;

public class CCar extends CVehicle implements Rideable{

	private double speedInKph;
	
	public CCar(String veh, Location loc, int yearOfProduction, double price, double speedInKph) {
		super(veh, loc, yearOfProduction, price);
		this.speedInKph = speedInKph;
	}

	@Override
	public double speedInKph() {
		return speedInKph;
	}

	public double getSpeed() {
		return speedInKph;
	}
	
	@Override
	public double priceInThndUSD() {
		return super.getPrice();
	}

	@Override 
	public String toString() {
		return super.toString() + "Price in USD thnd:\t" + super.getPrice() + "\n\t" + "Speed in Km per Hour:\t" + speedInKph + "\n";
	}
	
}

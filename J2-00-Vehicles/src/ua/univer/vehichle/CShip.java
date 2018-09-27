package ua.univer.vehichle;

public class CShip extends CVehicle implements Sailable{

	private int numPassengers;
	private double speedInKnot;
	private String portOfRegistration;
	
	public CShip(String veh, Location loc, int yearOfProduction, double price, String portOfRegistration, int numPassengers, double speedInKnot) {
		super(veh, loc, yearOfProduction, price);
		this.portOfRegistration = portOfRegistration;
		this.numPassengers = numPassengers;
		this.speedInKnot = speedInKnot;	
	}

	public String getPortOfRegistration() {
		return portOfRegistration;
	}

	public void setPortOfRegistration(String portOfRegistration) {
		this.portOfRegistration = portOfRegistration;
	}

	@Override
	public double speedInKph() {
		return 1.852 * speedInKnot;
	}

	public double getSpeed() {
		return speedInKnot;
	}	
	
	@Override
	public double priceInThndUSD() {
		return super.getPrice() * 1000;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Price in USD mln:\t" + super.getPrice() + "\n\t" + "Speed in Knot:\t\t" + speedInKnot + "\n\t" 
	            + "Number of Passengers:\t" + numPassengers  + "\n\t" + "Port of Registration:\t" + portOfRegistration + "\n";
	}
	
}

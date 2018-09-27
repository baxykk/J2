package ua.univer.vehichle;

public abstract class CVehicle {
	
	private final String vehicle;
	private Location loc;
	private final int yearOfProduction;
	private double price;
	
	public CVehicle(String veh, Location loc, int yearOfProduction, double price) {
		this.vehicle = veh;
		this.loc = loc;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
	}

	public abstract double speedInKph();
	public abstract double priceInThndUSD();
	
	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public double getPrice() {
		return price;
	}

	public double getSpeed() {
		return this.speedInKph();
	}
	
	public String getVehicle() {
		return vehicle;
	}
	
	public String toString(){
		return vehicle + ":\n\t" + loc + "\t"+"Year of production:\t" + yearOfProduction + 	"\n\t";
	}
	
}

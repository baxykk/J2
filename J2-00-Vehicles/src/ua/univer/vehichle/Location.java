package ua.univer.vehichle;

public class Location {

	private double latitude, longtitude;
	
	public Location(double latitude, double longtitude) {
		if (latitude > 90.0 || latitude < -90.0 || longtitude < -180.0 || longtitude > 180.0) throw new IllegalArgumentException();		
		this.latitude = latitude;
		this.longtitude = longtitude;
	}
	
	public Location(){
		this(0.0, 0.0);
	}
	
	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}

	@Override
	public String toString() {
		return "Location: latitude = " + latitude + ", longtitude = " + longtitude + ";\n";
	}
	
}

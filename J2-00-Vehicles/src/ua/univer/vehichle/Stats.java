package ua.univer.vehichle;

public class Stats<T extends CVehicle & Movable> {
	
	public static <T extends CVehicle & Movable> String getMaxSpeed(T[] arr) {
		double maxSpeed = 0;
		String veh = "";

		for (T t: arr) 
			if (maxSpeed <   t.getSpeed()) {
				maxSpeed = t.getSpeed();
				veh =  t.getVehicle();
			}	
		return veh +":\t" + maxSpeed;
	}	

	public static <T extends CVehicle & Movable> String getMaxPrice(T[] arr) {
		double maxPrice = 0;
		String veh = "";
	
		for (T t: arr) 
			if (maxPrice <   t.getPrice()) {
				maxPrice =  t.getPrice();
				veh = t.getVehicle();
			}	
		return veh +":\t" + maxPrice;
	}	
	
	public static <T extends CVehicle & Movable> String getNewest(T[] arr) {
		int year = 0;
		String veh = "";
	
		for (T t: arr) 
			if (year <  t.getYearOfProduction()) {
				year = t.getYearOfProduction();
				veh = t.getVehicle();
			}	
		return veh +":\t" + year;
	}	
	
	
}

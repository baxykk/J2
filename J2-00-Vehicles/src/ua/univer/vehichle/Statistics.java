package ua.univer.vehichle;

public class Statistics<T extends  Movable> {
	
	public static <T extends Movable> String getMaxSpeed(T[] arr) {
		double maxSpeed = 0;
		String veh = "";

		for (T t: arr) 
			if (maxSpeed <   t.getSpeed()) {
				maxSpeed = t.getSpeed();
				veh = ((CVehicle) t).getVehicle();
			}	
		return veh +":\t" + maxSpeed;
	}	

	public static <T extends Movable> String getMaxPrice(T[] arr) {
		double maxPrice = 0;
		String veh = "";
	
		for (T t: arr) 
			if (maxPrice < ((CVehicle) t).getPrice()) {
				maxPrice =  ((CVehicle) t).getPrice();
				veh = ((CVehicle) t).getVehicle();
			}	
		return veh +":\t" + maxPrice;
	}	
	
	public static <T extends Movable> String getNewest(T[] arr) {
		int year = 0;
		String veh = "";
	
		for (T t: arr) 
			if (year <  ((CVehicle) t).getYearOfProduction()) {
				year = ((CVehicle) t).getYearOfProduction();
				veh = ((CVehicle) t).getVehicle();
			}	
		return veh +":\t" + year;
	}	
	
	
}

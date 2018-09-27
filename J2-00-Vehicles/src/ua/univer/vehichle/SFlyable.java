package ua.univer.vehichle;

public class SFlyable {

	private static Flyable[] fl;
	
	public static String getMaxSpeed(Flyable[] arr) {
		double maxSpeed = 0;
		String veh = "";
	
		fl=arr;
		for (Flyable f : fl) 
			if (maxSpeed <  f.getSpeed()) {
				maxSpeed = f.getSpeed();
				veh = ((CVehicle) f).getVehicle();
			}	
		return veh +":\t" + maxSpeed;
	}	

	public static String getMaxPrice(Flyable[] arr) {
		double maxPrice = 0;
		String veh = "";
	
		fl=arr;
		for (Flyable f : fl) 
			if (maxPrice <  ((CVehicle) f).getPrice()) {
				maxPrice = ((CVehicle) f).getPrice();
				veh = ((CVehicle) f).getVehicle();
			}	
		return veh +":\t" + maxPrice;
	}	
	
	public static String getNewest(Flyable[] arr) {
		int year = 0;
		String veh = "";
	
		fl=arr;
		for (Flyable f : fl) 
			if (year <  ((CVehicle) f).getYearOfProduction()) {
				year = ((CVehicle) f).getYearOfProduction();
				veh = ((CVehicle) f).getVehicle();
			}	
		return veh +":\t" + year;
	}	
}

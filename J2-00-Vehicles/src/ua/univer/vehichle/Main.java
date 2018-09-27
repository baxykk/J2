package ua.univer.vehichle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CVehicle[] vdb = new CVehicle[8];
		vdb[0] = new CPlane("Airbus A320" , new Location(),	1999, 101.0, 12500, 150, 0.82);
		vdb[1] = new CPlane("Embraer Legacy 600" , new Location(), 2008, 25.9, 12497, 14, 0.80);
		vdb[2] = new CShip("Yacht Pelorus" , new Location(), 2004, 300, "Bermuda", 46, 19);
		vdb[3] = new CShip("M/S Amorella" , new Location(), 1988, 100, "Marienhamn", 2420, 20.5);
		vdb[4] = new CCar("VW Golf" , new Location(), 2018, 27.5, 200);
		vdb[5] = new CCar("Bugatti Chiron" , new Location(), 2016, 2400, 420);
		vdb[6] = new CAmphibiousCar("Gibbs Aquada" , new Location(), 1980, 100, 160, 27);
		vdb[7] = new CBatCar("Batmobile" , new Location(), 2015, 250, 250, 40, 0.4);
		
	
		for (CVehicle v : vdb) System.out.println(v);
		System.out.println();
/*		for (CVehicle v : vdb) System.out.printf("%-18s\t%,.2f \n", v.getVehicle(), v.priceInThndUSD());
		System.out.println();
		for (CVehicle v : vdb) System.out.printf("%-18s\t%,.0f \n", v.getVehicle(), v.speedInKph());
		System.out.println();
		for (CVehicle v : vdb) {
			Class[] interfaces = v.getClass().getInterfaces();
			for (Class i:interfaces) System.out.printf("%-18s\t%-18s\n", i, v.getVehicle());
		}
	
	*/
		
		
		Flyable[] fl1 = PropertySelector.getFlyable(vdb);
		Sailable[] sl1 = PropertySelector.getSailable(vdb);
		Rideable[] rd1 = PropertySelector.getRideable(vdb);
/*		
		System.out.println(Statistics.getMaxSpeed(fl1));
		System.out.println(Statistics.getMaxSpeed(sl1));
		System.out.println(Statistics.getMaxSpeed(rd1));
	
		
	
		System.out.println(Stats.getMaxSpeed(fl1));
		System.out.println(Stats.getMaxSpeed(sl1));
		System.out.println(Stats.getMaxSpeed(rd1));
*/			
		
//		for (Flyable f : fl1) System.out.println(f);
		
		double maxSpeed = 0;
		for (Flyable f : fl1) 
			if (maxSpeed < f.getSpeed()) maxSpeed = f.getSpeed();
		System.out.println("Flyable: "+ maxSpeed);
		
//		System.out.println("+");
		
//		for (Sailable s : s1) System.out.println(s);
		
		maxSpeed = 0;
		for (Sailable s : sl1) 
			if (maxSpeed < s.getSpeed()) maxSpeed = s.getSpeed();
		System.out.println("Sailable: "+ maxSpeed);
		
		
//		for (Rideable cv : r1) System.out.println(cv);
		
		maxSpeed = 0;
		for (Rideable r : rd1) 
			if (maxSpeed < r.getSpeed()) maxSpeed = r.getSpeed();
		System.out.println("Rideable: "+ maxSpeed);
		
	//	Flyable[] fl = PropertySelector.getFlyable(vdb);
	}

}

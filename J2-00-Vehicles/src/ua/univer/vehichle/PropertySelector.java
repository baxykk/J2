package ua.univer.vehichle;

public final class PropertySelector {
	private static CVehicle[] v;
	
	public static Flyable[] getFlyable(CVehicle[] cv) {			
		return arrToFlyable(getFlyableAsVehicle(cv));
	}
	
	public static Sailable[] getSailable(CVehicle[] cv) {			
		return arrToSailable(getSailableAsVehicle(cv));
	}
	
	public static Rideable[] getRideable(CVehicle[] cv) {			
		return arrToRideable(getRideableAsVehicle(cv));
	}
	
	private static CVehicle[] getFlyableAsVehicle(CVehicle[] cv) {	
		v = cv;
		int lastPosition = 0;
		for (int i = 0; i < v.length; i++) {
			
			if (isFlyable(v[i]) && (lastPosition == i)) lastPosition++;
			else if (isFlyable(v[i]) && (lastPosition != i))
					swap(lastPosition++, i);
		}		
		assert lastPosition > 0;			
		return copyArray(v, lastPosition);
	}
	
	private static CVehicle[] getSailableAsVehicle(CVehicle[] cv) {	
		v = cv;
		int lastPosition = 0;
		for (int i = 0; i < v.length; i++) {
			
			if (isSailable(v[i]) && (lastPosition == i)) lastPosition++;
			else if (isSailable(v[i]) && (lastPosition != i))
					swap(lastPosition++, i);
		}		
		assert lastPosition > 0;			
		return copyArray(v, lastPosition);
	}
	
	private static CVehicle[] getRideableAsVehicle(CVehicle[] cv) {	
		v = cv;
		int lastPosition = 0;
		for (int i = 0; i < v.length; i++) {
			
			if (isRideable(v[i]) && (lastPosition == i)) lastPosition++;
			else if (isRideable(v[i]) && (lastPosition != i))
					swap(lastPosition++, i);
		}		
		assert lastPosition > 0;				
		return copyArray(v, lastPosition);
	}
	
	
	
	private static boolean isFlyable(CVehicle cv) {
		return (cv instanceof Flyable);
	}
	
	private static boolean isSailable(CVehicle cv) {
		return (cv instanceof Sailable);
	}
	
	private static boolean isRideable(CVehicle cv) {
		return (cv instanceof Rideable);
	}
	
	private static void swap(int i, int j) {
		CVehicle c = v[i];
		v[i] = v[j];
		v[j] = c;
	}
	
	private static CVehicle[] copyArray(CVehicle[] cv, int len) {
		CVehicle[] tmp = new CVehicle[len];
		System.arraycopy(cv, 0, tmp, 0, len);
		return tmp;
	}

	private static Flyable[] arrToFlyable(CVehicle[] cv) {
		Flyable[] tmp = new Flyable[cv.length];
		for (int i = 0; i < cv.length; i++) {
			tmp[i] = (Flyable) cv[i];
		}
		return tmp;
	}
	
	private static Sailable[] arrToSailable(CVehicle[] cv) {
		Sailable[] tmp = new Sailable[cv.length];
		for (int i = 0; i < cv.length; i++) {
			tmp[i] = (Sailable) cv[i];
		}
		return tmp;
	}
	
	private static Rideable[] arrToRideable(CVehicle[] cv) {
		Rideable[] tmp = new Rideable[cv.length];
		for (int i = 0; i < cv.length; i++) {
			tmp[i] = (Rideable) cv[i];
		}
		return tmp;
	}
	
	
/*
	private static int sortAndReturnLength(Class choice) {
		int lastPosition = -1;
		Class c = choice;
		
		for (int i = 0; i < v.length; i++) {
//			interfaces = v[i].getClass().getInterfaces();
			if (v[i] instanceof c.getClass()) swap(++lastPosition, i);
		}
		
		return lastPosition;
	}
		
	private static boolean hasInterface(Class choice) {  // object, get class -> to check
		for (Class cl:interfaces) 
			if (cl instanceof choice) return true;
		return false;
	}
	
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CShip[] c = new CShip[1];
		System.out.println(c.getClass().getPackageName());
	}	
	
}

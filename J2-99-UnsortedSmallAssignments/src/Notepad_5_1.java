import java.util.ArrayList;

public class Notepad_5_1 {

	private ArrayList<Record> records;
	
	public Notepad_5_1() {
		records = new ArrayList<Record>();
	}

	public ArrayList<String> getRecordsOn(String date) {	
		for (Record d : records) {
			if (d.date.equals(date)) return d.strings;
		}
		return null;
	}

	public void addRecord(String date, String s) {
		Record temp = recordExists(date);
		if (temp != null) temp.strings.add(s);
		else {
				
				Record rec = new Record(date);
				rec.strings.add(s);
				records.add(rec);

		}
	}

	private Record recordExists(String date) {
		for (Record d : records) {
			if (d.date.equals(date)) return d;
		}
		return null;
	}
	
	private static class Record{	
		private String date;
		private ArrayList<String> strings;
		
		public Record(String date) {
			this.date = date;
			strings = new ArrayList<String>();
		}		
	}	
	
	public static void main(String[] args) { //testing
		
		Notepad_5_1 note = new Notepad_5_1();		
		note.addRecord("26-09-2018", "Record1");
		note.addRecord("26-09-2018", "Record2");
		ArrayList<String> records = note.getRecordsOn("26-09-2018");	
		for (String record : records) {
			System.out.println(record);
		}
		
	}
}

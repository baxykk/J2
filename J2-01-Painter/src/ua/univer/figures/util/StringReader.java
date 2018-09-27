package ua.univer.figures.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringReader {

	Scanner scanner;
	
	public StringReader(File f) {
		try {
			scanner = new Scanner(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
	}

	public String[] readLine() {
		String[] temp = null;
		if (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			temp =  line.split(";");
//			for(String t:temp) System.out.println(t);
		}
		return temp;
	}

	public boolean hasNext() {
		return scanner.hasNext();
	}
	
}

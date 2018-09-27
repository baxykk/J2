package ua.univer.figures.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import ua.univer.figures.model.AbstractShape;

public class StringReader {

	Scanner scanner;
	ArrayList<AbstractShape> shapes = new ArrayList<AbstractShape>();
	
	public StringReader(File f) {
		String[] temp = null;
		this.getFile(f);
		FactoryProducer factory = new FactoryProducer();
		AbstractFactory af = factory.getFactory(1);
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			temp =  line.split(";");
			shapes.add(af.getShape(temp));
		}
	}
	
	public ArrayList<AbstractShape> getShapes() {
		return shapes;
	}

	public String[] readLine() {
		String[] temp = null;
		if (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			temp =  line.split(";");
		}
		return temp;
	}
	
	public boolean hasNext() {
		return scanner.hasNext();
	}

	
	private void getFile(File f) {
		try {
			scanner = new Scanner(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}

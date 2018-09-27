package ua.univer.figures;

import java.io.File;
import java.io.FileNotFoundException;

import javax.swing.JFrame;

import ua.univer.figures.util.StringReader;
import ua.univer.figures.view.ShapeGraphics;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		JFrame window = new JFrame("Painter");
		ShapeGraphics content = new ShapeGraphics(new StringReader(new File(args[0])));;
		window.setContentPane(content);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocation(120,70);
		window.setSize(550,550);
		window.setVisible(true);
		
/*		Scanner scanner = new Scanner(new File(args[0]));
		ArrayList<String> shapes = new ArrayList<>();
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] temp =  line.split(";");
			for(String t:temp) System.out.println(t);
		}
*/		
		
	}

}

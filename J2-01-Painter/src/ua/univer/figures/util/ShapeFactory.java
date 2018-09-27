package ua.univer.figures.util;

import java.awt.Color;
import ua.univer.figures.model.AbstractShape;
import ua.univer.figures.model.color.ColoredLine;
import ua.univer.figures.model.color.ColoredPoint;
import ua.univer.figures.model.color.ColoredPolyLine;
import ua.univer.figures.model.shape.Line;
import ua.univer.figures.model.shape.Point;
import ua.univer.figures.model.shape.PolyLine;

public class ShapeFactory extends AbstractFactory {

	@Override
	public AbstractShape getShape(String[] s) {
	
		if (hasColor(s[0])) return getColoredShape(s);
		else 				return getSimpleShape(s);
	}
	
	private static boolean hasColor(String s) {
		return Character.isLetter(s.charAt(0));
	}
	
	public AbstractShape getSimpleShape(String[] s) {
		Point[] points;
		
		if (s.length % 2 == 1)  
			points = parseToPoints(s, 1); //odd number -> color included
		else points = parseToPoints(s, 0); 
		
		if (points.length == 1)
			return new Point(points[0].getX(), points[0].getY());
		else if (points.length == 2)
			return new Line(points[0], points[1]);
		else if (points.length > 2)
			return new PolyLine(points);
		else throw new IllegalArgumentException();
	}
	
	@Override
	public AbstractShape getColoredShape(String[] s) {
		Point[] points;
		
		if (s.length % 2 == 1)  
			points = parseToPoints(s, 1); //odd number -> color included
		else points = parseToPoints(s, 0); 
		
		if (points.length == 1)
			return new ColoredPoint(points[0].getX(), points[0].getY(), ColorSelector(s[0]));
		else if (points.length == 2)
			return new ColoredLine(points[0], points[1], ColorSelector(s[0]));
		else if (points.length > 2)
			return new ColoredPolyLine(points,ColorSelector(s[0]));
		else throw new IllegalArgumentException();
	
	}
	
	
	
	private static Point[] parseToPoints(String[] s, int index) {
		int len = s.length - index;
		Point[] points = new Point[len/2];
		
		for (int i = index; i < len; i=i+2) {
			points[i/2] = new Point(Integer.parseInt(s[i]),Integer.parseInt(s[i+1]));
		}

		return points;
	}
	
	
	
	private static Color ColorSelector(String s) {
		switch (s.toLowerCase()) {
			case "black": return Color.BLACK;
			case "red": return Color.RED;
			case "blue": return Color.BLUE;
			case "green": return Color.GREEN;
			default: throw new IllegalArgumentException();
		}
	}
	
}

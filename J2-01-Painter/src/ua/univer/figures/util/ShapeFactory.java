package ua.univer.figures.util;

import java.util.ArrayList;
import java.util.Iterator;

import ua.univer.figures.model.color.Colour;
import ua.univer.figures.model.shape.Line;
import ua.univer.figures.model.shape.Point;
import ua.univer.figures.model.shape.PolyLine;
import ua.univer.figures.model.shape.Shape;

public class ShapeFactory extends AbstractFactory {
	
	@Override
	public Colour getColor(String[] s) {
		return null;
	}

	@Override
	public Shape getShape(String[] s) {
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
	
	private static Point[] parseToPoints(String[] s, int index) {
		int len = s.length - index;
		Point[] points = new Point[len/2];
		
		for (int i = index; i < len; i=i+2) {
			points[i/2] = new Point(Integer.parseInt(s[i]),Integer.parseInt(s[i+1]));
		}

		return points;
	}
	
}

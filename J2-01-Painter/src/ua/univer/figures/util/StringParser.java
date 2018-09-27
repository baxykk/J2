package ua.univer.figures.util;

import ua.univer.figures.model.shape.Point;

public class StringParser {

	String color;
	Point[] points;
	

	
	public static Object[] parseToObject(String[] s) {
		String tmp = "";
		String[] arr;
		if (!isInt(s[0])) {
			tmp = s[0];
			arr = new String[s.length-1];
			System.arraycopy(s, 1, arr, 0, arr.length-1);
			return combineAndConvert(tmp, parseToPoints(arr));
		}
		else return convert(parseToPoints(s));		
	}
	
	private static boolean isInt(String s) {
		return Character.isDigit(s.charAt(0));
	}
	
	private static Point[] parseToPoints(String[] s) {
		if (s.length%2 != 0) throw new IllegalArgumentException();
		Point[] points = new Point[s.length/2];
		for (int i = 0; i < s.length-1; i=i+2) {
			points[i/2] = new Point(Integer.parseInt(s[i]),Integer.parseInt(s[i+1]));
		}
		return points;
	}
	
	private static Object[] combineAndConvert(String s, Point[] points) {
		Object[] tmp = new Object[points.length + 1];
		tmp[0] = s;
		System.arraycopy(points, 0, tmp, 1, tmp.length-1);
		return tmp;
	}
	
	private static Object[] convert(Point[] points) {
		Object[] tmp = points;
		return tmp;
	}
	
}

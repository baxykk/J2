package ua.univer.figures.model.shape;

import java.awt.Graphics;

public class Line extends Shape implements Cloneable {
	public Point Begin, End;
    private int ID;
	
	// adHoc
	public Line(Point begin, Point end) {
		super();
		ID = count;
		Begin = begin;
		End = end;
	}

	public Line(int x1, int y1, int x2, int y2) {
		Begin = new Point(x1, y1);
		End = new Point(x2, y2);
	}

	public Line(Line line) {
		Begin = new Point(line.Begin.getX(), line.Begin.getY());
		End = new Point(line.End.getX(), line.End.getY());
	}

	@Override
	public Line clone() throws CloneNotSupportedException {
		//return new Line(
		//		new Point(Begin.getX(), Begin.getY()), 
		//		new Point(End.getX(), End.getY())
		//		);
		return new Line(
				Begin.clone(),
				End.clone()
				);
	}

	@Override
	public String toString() {
		return "Line [Begin=" + Begin + ", End=" + End + "]";
	}

	public double length() {		
		return Math.sqrt(
				Math.pow(Begin.getX()-End.getX(), 2)+
				Math.pow(Begin.getY()-End.getY(), 2)
				);
	}

	@Override
	public void draw(Graphics g) {
		g.drawLine(Begin.getX(), Begin.getY(), End.getX(), End.getY());		
	}

}

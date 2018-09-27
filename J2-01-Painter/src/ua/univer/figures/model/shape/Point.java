package ua.univer.figures.model.shape;

import java.awt.Graphics;

public class Point extends Shape {
    private int x;
    private int y;
    private int ID;
    private final int width = 10;
    private final int height = 10;
    
	public Point(int x, int y) {
		super();
		ID=count;
		this.x = x;
		this.y = y;
	}
	public Point() {
		this(0,0);		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public Point clone() throws CloneNotSupportedException {
		return new Point(x, y);
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]="+ID;
	}
	@Override
	public void draw(Graphics g) {
		g.drawOval(this.x, this.y, width, height);	
	}
    
}

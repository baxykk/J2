package ua.univer.figures.model.shape;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class PolyLine extends Shape {
	int[] xPoints;
	int[] yPoints;
	int nPoints;
    private int ID;

	public PolyLine(Point[] arrPoints) {	
		super();
		ID = count;
		nPoints = arrPoints.length;
		xPoints = new int[arrPoints.length];
		yPoints = new int[arrPoints.length];
		
		for (int i = 0; i < arrPoints.length; i++) {
			xPoints[i] = arrPoints[i].getX();
			yPoints[i] = arrPoints[i].getY();
		}
	}

	@Override
	public void draw(Graphics g) {
		
		assert xPoints != null && yPoints !=null;
		assert nPoints > 2;
		
		g.drawPolyline(xPoints, yPoints, nPoints);
	}
	 
}

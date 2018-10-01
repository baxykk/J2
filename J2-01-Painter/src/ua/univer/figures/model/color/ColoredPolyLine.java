package ua.univer.figures.model.color;

import java.awt.Color;
import java.awt.Graphics;

import ua.univer.figures.model.AbstractShape;
import ua.univer.figures.model.shape.Point;
import ua.univer.figures.model.shape.PolyLine;

public class ColoredPolyLine extends PolyLine implements AbstractShape, Colour {

    private Color color;

	public ColoredPolyLine(Point[] arrPoints, Color c) {	
		super(arrPoints);
		 color = c;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(color);
		super.draw(g);
		g.setColor(Color.BLACK);
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}
	 
}

package ua.univer.figures.model.color;

import java.awt.Color;
import java.awt.Graphics;

import ua.univer.figures.model.AbstractShape;
import ua.univer.figures.model.shape.Point;

public class ColoredPoint extends Point implements AbstractShape, Colour {
    private Color color;
    
	public ColoredPoint(int x,int y, Color c) {
		super(x, y);
		color = c;
	}
	
	@Override
	public ColoredPoint clone() throws CloneNotSupportedException {
		return new ColoredPoint(super.getX(), super.getY(), new Color(color.getRGB()));
	}
	@Override
	public String toString() {
		return "Point color "+ color + "]";
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		super.draw(g);
		g.setColor(Color.BLACK);
	}
    
}

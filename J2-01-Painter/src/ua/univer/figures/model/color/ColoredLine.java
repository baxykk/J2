package ua.univer.figures.model.color;

import java.awt.Color;
import java.awt.Graphics;
import ua.univer.figures.model.AbstractShape;
import ua.univer.figures.model.shape.Line;
import ua.univer.figures.model.shape.Point;

public class ColoredLine extends Line implements Cloneable, AbstractShape, Colour {
	 private Color color;
	 
	public ColoredLine(Point p1, Point p2, Color color) {
		super(p1, p2);
		this.color = color;
	}

	@Override
	public ColoredLine clone() throws CloneNotSupportedException {
				return new ColoredLine(super.Begin.clone(), super.End.clone(), new Color(color.getRGB()));
	}

	@Override
	public String toString() {
		return "Line " + super.toString()+", Color =" + color+ "]";
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

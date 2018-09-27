package ua.univer.figures.model.color;

import java.awt.Color;

public class CRed implements Colour {
	Color color;

	public CRed() {
		this.color = Color.RED;
	}
	
	@Override
	public Color getColor() {
		return color;
	}
}

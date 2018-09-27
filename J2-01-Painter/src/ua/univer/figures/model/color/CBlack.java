package ua.univer.figures.model.color;

import java.awt.Color;

public class CBlack implements Colour {
	Color color;

	public CBlack() {
		this.color = Color.BLACK;
	}
	
	@Override
	public Color getColor() {
		return color;
	}
}

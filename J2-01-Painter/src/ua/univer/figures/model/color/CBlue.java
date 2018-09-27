package ua.univer.figures.model.color;

import java.awt.Color;

public class CBlue implements Colour {
	Color color;

	public CBlue() {
		this.color = Color.BLUE;
	}
	
    @Override
	public Color getColor() {
		return color;
	}

}
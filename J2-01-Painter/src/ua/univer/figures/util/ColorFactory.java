package ua.univer.figures.util;

import ua.univer.figures.model.color.CBlack;
import ua.univer.figures.model.color.CBlue;
import ua.univer.figures.model.color.CRed;
import ua.univer.figures.model.color.Colour;
import ua.univer.figures.model.shape.Point;
import ua.univer.figures.model.shape.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Colour getColor(String[] s) {
		switch (s[0].toLowerCase()) {
		case "black": return new CBlack();
		case "red": return new CRed();
		case "blue": return new CBlue();
		default: throw new IllegalArgumentException();
		}
	}

	@Override
	public Shape getShape(String[] s) {
		return null;
	}

}

package ua.univer.figures.util;

import java.awt.Color;

import ua.univer.figures.model.AbstractShape;
import ua.univer.figures.model.color.CBlack;
import ua.univer.figures.model.color.CBlue;
import ua.univer.figures.model.color.CRed;
import ua.univer.figures.model.shape.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public AbstractShape getColoredShape(String[] s) {
		
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

	class ColorSelector{
		private Color c;

		private void ColorSelector(String s) {
			switch (s.toLowerCase()) {
				case "black": c = Color.BLACK;
				case "red": c = Color.RED;
				case "blue": c = Color.BLUE;
				default: throw new IllegalArgumentException();
			}
		}
	
	}	
}

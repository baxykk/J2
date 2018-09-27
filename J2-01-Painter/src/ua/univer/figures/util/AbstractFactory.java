package ua.univer.figures.util;


import ua.univer.figures.model.color.Colour;
import ua.univer.figures.model.shape.Point;
import ua.univer.figures.model.shape.Shape;

public abstract class AbstractFactory {

	abstract public Colour getColor(String[] s);
	abstract public Shape getShape(String[] s);
	
}

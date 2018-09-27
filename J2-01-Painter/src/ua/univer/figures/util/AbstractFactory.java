package ua.univer.figures.util;


import ua.univer.figures.model.AbstractShape;

public abstract class AbstractFactory {

	abstract public AbstractShape getShape(String[] s);
	abstract public AbstractShape getColoredShape(String[] s) ;
	
}

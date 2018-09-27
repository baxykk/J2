package ua.univer.figures.util;

import ua.univer.figures.model.shape.Point;

public class FactoryProducer {
	
	public AbstractFactory getFactory(int i) {
		if (i == 1) {
			return new ColorFactory();
		}
		else if (i == 2) {
			return new ShapeFactory();
		}	
		return null;
	}	
	
}

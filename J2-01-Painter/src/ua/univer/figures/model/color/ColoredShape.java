package ua.univer.figures.model.color;

import ua.univer.figures.model.AbstractShape;

public abstract class ColoredShape implements AbstractShape{
	 static int count;
	 public ColoredShape() {
		count++;
	}
	 public void print(){
		 System.out.println(this);
	 };
	 
}

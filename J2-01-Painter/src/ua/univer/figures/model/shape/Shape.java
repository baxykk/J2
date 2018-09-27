package ua.univer.figures.model.shape;

import java.awt.Graphics;
import java.awt.Graphics2D;

public abstract class Shape {
	 static int count;
	 public Shape() {
		count++;
	}
	 public void print(){
		 System.out.println(this);
	 };
	 
	 public abstract void draw(Graphics g);
}

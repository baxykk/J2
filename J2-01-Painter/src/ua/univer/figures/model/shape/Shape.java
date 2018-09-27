package ua.univer.figures.model.shape;

import java.awt.Color;
import java.awt.Graphics;

import ua.univer.figures.model.AbstractShape;

public abstract class Shape implements AbstractShape{
	 static int count;
	 public Shape() {
		count++;
	}
	 public void print(){
		 System.out.println(this);
	 };
	 
}

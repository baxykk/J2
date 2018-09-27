package ua.univer.figures.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import ua.univer.figures.model.AbstractShape;
import ua.univer.figures.util.AbstractFactory;
import ua.univer.figures.util.FactoryProducer;
import ua.univer.figures.util.StringReader;

public class ShapeGraphics extends JPanel {

	ArrayList<AbstractShape> shapes;
	Canvas canvas;
	Graphics g; 
	
	public ShapeGraphics(ArrayList<AbstractShape> as) {
		shapes = as;
		canvas = new Canvas();
		setLayout(new BorderLayout());		
		canvas.setBackground(new Color(200,255,175));
		JButton button = new JButton("Start");

/*		button.addActionListener( e->{
			if(MouseEvent.((MouseEvent)e).MOUSE_CLICKED)
		}
			public void mouseClicked(MouseEvent e) {
				sr.readLine();
			}		
		});
*/		
		button.addMouseListener( new MouseAdapter(){
				@Override
				public void mouseClicked(MouseEvent e) {
					g = canvas.getGraphics();
					for (AbstractShape ash : shapes) {
						ash.draw(g);
					}
					button.setEnabled(false);
				}	
		});
    	this.add(canvas, BorderLayout.CENTER);
		this.add(button, BorderLayout.NORTH);
	}

	class MouseImp extends MouseAdapter{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			super.mouseClicked(e);
		}
		
	}
	
	private class Canvas extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
		}
	}
	
	
}

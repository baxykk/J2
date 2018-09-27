package ua.univer.figures.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

import ua.univer.figures.util.AbstractFactory;
import ua.univer.figures.util.FactoryProducer;
import ua.univer.figures.util.StringReader;

public class ShapeGraphics extends JPanel {

	StringReader sr;
	Canvas canvas = new Canvas();
	Graphics g = canvas.getGraphics();
	
	public ShapeGraphics(StringReader sr) throws HeadlessException {
		this.sr = sr;

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
					if (sr.hasNext()) {	
						String[] s = sr.readLine();
						String[] s1 = new String[1];
						s1[0] = s[0];
						FactoryProducer factory = new FactoryProducer();
						Graphics g = canvas.getGraphics();
						if (Character.isLetter(s[0].charAt(0))) {
							AbstractFactory af = factory.getFactory(1);
							AbstractFactory af1= factory.getFactory(2);
							System.out.println(af);
							System.out.println(af1);
							af.getColor(s1);						
							af1.getShape(s).draw(g);
						}
						else {
							AbstractFactory af = factory.getFactory(2);
							af.getShape(s).draw(g);
						}
					}
					else {
						button.setEnabled(false);
					}
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

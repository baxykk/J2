package ua.univer.figures.view;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ua.univer.figures.model.shape.AbstractFigure;
import ua.univer.figures.model.shape.Line;
import ua.univer.figures.model.shape.Point;
import ua.univer.figures.util.AbstactFactoryFigure;
import ua.univer.figures.util.ColorFactoryFigure;
import ua.univer.figures.util.FactoryFigure;
import ua.univer.figures.util.FactoryListFigures;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class FigureForm {

	private JFrame frame;
	JPanel panelDraw;
	AbstractFigure[] masPoint;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FigureForm window = new FigureForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FigureForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JButton btnPress = new JButton("press");
		btnPress.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphics gr = panelDraw.getGraphics();
				gr.clearRect(0, 0, 200, 200);
				AbstactFactoryFigure factoryFig = new FactoryFigure();
				masPoint = FactoryListFigures.listFigure(factoryFig, 20).toArray(new AbstractFigure[0]);
				for (AbstractFigure figure : masPoint) {
					if (figure instanceof Point)
						gr.drawOval(((Point) figure).getX(), ((Point) figure).getY(), 10, 10);
					if (figure instanceof Line) {
						Line l = (Line) figure;
						gr.drawLine(l.Begin.getX(), l.Begin.getY(), l.End.getX(), l.End.getY());
					}
				}
			}

		});
		btnPress.setBounds(20, 25, 89, 23);
		panel.add(btnPress);

		panelDraw = new JPanel();
		panelDraw.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println(e.getX());
				System.out.println(e.getY());
			}
		});
		panelDraw.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			
			}
		});
		panelDraw.setBounds(20, 49, 404, 186);
		panel.add(panelDraw);

		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mntmNewMenuItem.setBounds(0, 0, 129, 22);
		panel.add(mntmNewMenuItem);
	}
}

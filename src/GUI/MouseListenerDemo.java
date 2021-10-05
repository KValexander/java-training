package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MouseListenerDemo implements MouseListener {
	
	JFrame frame = new JFrame();
	JLabel label;
	
	ImageIcon bup;
	ImageIcon korgi;
	ImageIcon logo;
	ImageIcon shape;
	
	MouseListenerDemo() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout());
		
		label = new JLabel();
		label.addMouseListener(this);
		
		bup = new ImageIcon("bup.png");
		korgi = new ImageIcon("korgi.png");
		logo = new ImageIcon("logo.png");
		shape = new ImageIcon("shape.png");
		
		label.setIcon(bup);
		
		frame.add(label);
//		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
//		System.out.println("You clicked the mouse");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("You pressed the mouse");
		label.setIcon(shape);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("You release the mouse");
		label.setIcon(korgi);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("You entered the component");
		label.setIcon(logo);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("You exited the component");
		label.setIcon(bup);
	}

}

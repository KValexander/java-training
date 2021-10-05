package GUI;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class KeyListenerDemo implements KeyListener {
	
	JFrame frame = new JFrame();
	JLabel label;
	ImageIcon icon;
	
	KeyListenerDemo() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.addKeyListener(this);
		
		icon = new ImageIcon("shape.png");
		
		label = new JLabel();
		label.setBounds(0,0, 128, 128);
		label.setIcon(icon);
//		label.setBackground(Color.red);
//		label.setOpaque(true);
		
		frame.getContentPane().setBackground(Color.yellow);
		frame.add(label);
		
		frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		switch(e.getKeyChar()) {
			case 'a': label.setLocation(label.getX() - 10, label.getY()); break;
			case 'd': label.setLocation(label.getX() + 10, label.getY()); break;
			case 'w': label.setLocation(label.getX(), label.getY() - 10); break;
			case 's': label.setLocation(label.getX(), label.getY() + 10); break;
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
			case 65: label.setLocation(label.getX() - 10, label.getY()); break;
			case 68: label.setLocation(label.getX() + 10, label.getY()); break;
			case 87: label.setLocation(label.getX(), label.getY() - 10); break;
			case 83: label.setLocation(label.getX(), label.getY() + 10); break;
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("You release key char: " + e.getKeyChar());
		System.out.println("You release key char: " + e.getKeyCode());
		
	}

}

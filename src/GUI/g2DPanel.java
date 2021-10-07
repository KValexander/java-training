package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class g2DPanel extends JPanel implements ActionListener{
	
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	Image korgi;
	Image backgroundImage;
	Timer timer;
	int xVelocity = 2;
	int yVelocity = 1;
	int x = 0;
	int y = 0;
	
	
	g2DPanel() {

		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.black);
		korgi = new ImageIcon("korgi.png").getImage();
		backgroundImage = new ImageIcon("background.jpg").getImage();
		timer = new Timer(10, this);
		timer.start();
		
	}

	@Override
	public void paint(Graphics g) {
		
		super.paint(g); // paint background
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(backgroundImage, 0, 0, null);
		g2D.drawImage(korgi, x, y, null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(x >= PANEL_WIDTH - korgi.getWidth(null) || x < 0) xVelocity *= -1;
		if(y >= PANEL_HEIGHT - korgi.getHeight(null) || y < 0) yVelocity *= -1;
		
		
		x += xVelocity;
		y += yVelocity;
		repaint();
		
	}

}

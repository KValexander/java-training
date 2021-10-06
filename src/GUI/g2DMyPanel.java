package GUI;

import java.awt.Color;
import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class g2DMyPanel extends JPanel{
	
	Image image;
	
	g2DMyPanel() {
		
		image = new ImageIcon("background.jpg").getImage();
		
		this.setPreferredSize(new Dimension(500, 500));
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;

		g2D.drawImage(image, 0, 0, null);
		g2D.setPaint(Color.blue);
		g2D.setStroke(new BasicStroke(5));
		g2D.drawLine(0, 0, 500, 500);

		g2D.setPaint(Color.pink);
		g2D.drawRect(100, 100, 300, 300);
		
		g2D.fillRect(150, 150, 200, 200);
		
		g2D.setPaint(Color.cyan);
		g2D.drawOval(0, 0, 500, 500);
		g2D.fillOval(100, 100, 300, 300);
		
		g2D.setPaint(Color.red);
		g2D.drawArc(0, 0, 100, 100, 180, 180);
		g2D.fillArc(0, 0, 100, 100, 0, 180);
		g2D.setPaint(Color.magenta);
		g2D.fillArc(0, 0, 100, 100, 180, 180);
		
		int[] xPoints = {150, 250, 350};
		int[] yPoints = {300, 150, 300};
		g2D.setPaint(Color.yellow);
		g2D.drawPolygon(xPoints, yPoints, 3);
		g2D.fillPolygon(xPoints, yPoints, 3);

		g2D.setPaint(Color.orange);
		g2D.setFont(new Font("Arial", Font.BOLD, 30));
		g2D.drawString("U R A WINNER! :>", 50, 50);
		
		
	}

}

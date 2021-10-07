package GUI;

import javax.swing.JFrame;

public class g2DAnimation extends JFrame{
	
	g2DPanel panel;
	
	g2DAnimation() {
		panel = new g2DPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	

}

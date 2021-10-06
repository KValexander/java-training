package GUI;

import javax.swing.*;

public class g2DGraphic extends JFrame {
	
	
	g2DMyPanel panel;
	
	g2DGraphic() {
		
		panel = new g2DMyPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setSize(500, 500);

		this.add(panel);
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}

}

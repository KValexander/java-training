package GUI;

import javax.swing.JFrame;

public class DragAndDrop {
	
	JFrame frame = new JFrame();
	
	DragPanel dragPanel = new DragPanel();
	
	DragAndDrop() {
		
		frame.add(dragPanel);
		
		frame.setTitle("Drap And Drop");
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}

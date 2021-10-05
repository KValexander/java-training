package GUI;

import java.awt.*;

import javax.swing.*;

public class ColorChooserDemo {
	JFrame frame = new JFrame();
	
	ColorChooserDemo() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		JButton button = new JButton("Pick a color");
		
		JLabel label = new JLabel();
		label.setBackground(Color.white);
		label.setText("This is some text :>");
		label.setFont(new Font("Arial", Font.PLAIN, 100));
		label.setOpaque(true);

		
		button.addActionListener(e -> {
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
			
			label.setForeground(color);
//			label.setBackground(color);
		});
		
		frame.add(button);
		frame.add(label);
		
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);		
	}
	

}

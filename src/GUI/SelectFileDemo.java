package GUI;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

public class SelectFileDemo extends JFrame implements ActionListener {
	
	JButton button;
	
	public SelectFileDemo() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select File");
		button.addActionListener(this);
		
		this.add(button);

		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			JFileChooser fileChooser = new JFileChooser();
			
			fileChooser.setCurrentDirectory(new File("."));
			
			int response = fileChooser.showOpenDialog(null); // select file to open
//			int response = fileChooser.showSaveDialog(null); // select file to save
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}
	}

}

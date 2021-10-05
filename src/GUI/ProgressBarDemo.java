package GUI;

import java.awt.*;
import javax.swing.*;

public class ProgressBarDemo {
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0, 500);
	
	public ProgressBarDemo() {
		
		bar.setValue(0);
		bar.setBounds(0, 0, 420, 50);
		bar.setStringPainted(true);
		bar.setFont(new Font("Arial", Font.BOLD, 25));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		
		frame.add(bar);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}
	
	public void fill() {
		int counter = 500;
		
		while(counter >= 1) {
			
			bar.setValue(counter);
			bar.setString(counter + "/500 HP");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			counter -= 1;
		}
		bar.setString("Done! You are dead :>");		
	}

}

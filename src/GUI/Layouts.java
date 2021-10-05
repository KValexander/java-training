package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
//import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
//import javax.swing.BorderFactory;
//import javax.swing.ImageIcon;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.border.Border;

public class Layouts extends JFrame{

	public Layouts(int w, int h) {
		this.setTitle("Layout"); // sets title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
//		this.setResizable(false); // prevent frame from being resized
		this.setSize(w, h); // sets the x-dimension and y-dimension of frame
		this.setLocationRelativeTo(null);
		this.setVisible(true); // make frame visible
		this.setLayout(null); // set layout
		
		JButton btn1 = this.createButton(10, 10, 200, 40, "Border Layout");
		JButton btn2 = this.createButton(10, 60, 200, 40, "Flow layout");
		JButton btn3 = this.createButton(10, 110, 200, 40, "Grid layout");
		
		btn1.addActionListener(e -> {
			this.remove(btn1);
			this.remove(btn2);
			this.remove(btn3);
			this.bLayout();
		});
		
		btn2.addActionListener(e -> {
			this.remove(btn1);
			this.remove(btn2);
			this.remove(btn3);
			this.fLayout();
		});
		
		btn3.addActionListener(e -> {
			this.remove(btn1);
			this.remove(btn2);
			this.remove(btn3);
			this.gLayout();
		});
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		
	}
	
	private JButton createButton(int x, int y, int w, int h, String text) {
		JButton button = new JButton();
		button.setBounds(x, y, w, h);
		button.setText(text);
		button.setFocusable(false);
		
		return button;
	}
	
//	Example GridLayout
	public void gLayout() {
		this.setLayout(new GridLayout(3, 3, 0, 0));
		
		this.add(new JButton("1"));
		this.add(new JButton("2"));
		this.add(new JButton("3"));
		this.add(new JButton("4"));
		this.add(new JButton("5"));
		this.add(new JButton("6"));
		this.add(new JButton("7"));
		this.add(new JButton("8"));
		this.add(new JButton("9"));
//		this.add(new JButton("10"));
		
		this.setVisible(true);
	}
	
//	Example FlowLayout
	public void fLayout() {
//		this.setLayout(new FlowLayout(FlowLayout.LEADING)); // Right
//		this.setLayout(new FlowLayout(FlowLayout.CENTER)); // Center
//		this.setLayout(new FlowLayout(FlowLayout.TRAILING)); // Left
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(250, 250));
		panel.setBackground(Color.lightGray);
		panel.setLayout(new FlowLayout());
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		
		this.add(panel);

		this.setVisible(true);
	}
	
	
//	Example BorderLayout
	public void bLayout() {
		this.setLayout(new BorderLayout(0, 0)); // set layout

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.blue);
		
		panel1.setPreferredSize(new Dimension(100, 100));
		panel2.setPreferredSize(new Dimension(100, 100));
		panel3.setPreferredSize(new Dimension(100, 100));
		panel4.setPreferredSize(new Dimension(100, 100));
		panel5.setPreferredSize(new Dimension(100, 100));
		
//		--------------- sub panels
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();
		
		panel6.setBackground(Color.black);
		panel7.setBackground(Color.darkGray);
		panel8.setBackground(Color.gray);
		panel9.setBackground(Color.lightGray);
		panel10.setBackground(Color.white);
		
		panel5.setLayout(new BorderLayout(0, 0));
		
		panel6.setPreferredSize(new Dimension(50, 50));
		panel7.setPreferredSize(new Dimension(50, 50));
		panel8.setPreferredSize(new Dimension(50, 50));
		panel9.setPreferredSize(new Dimension(50, 50));
		panel10.setPreferredSize(new Dimension(50, 50));
		
		panel5.add(panel6, BorderLayout.NORTH);
		panel5.add(panel7, BorderLayout.WEST);
		panel5.add(panel8, BorderLayout.EAST);
		panel5.add(panel9, BorderLayout.SOUTH);
		panel5.add(panel10, BorderLayout.CENTER);
//		--------------- sub panels
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.WEST);
		this.add(panel3, BorderLayout.EAST);
		this.add(panel4, BorderLayout.SOUTH);
		this.add(panel5, BorderLayout.CENTER);

		this.setVisible(true);
	}
	

}

package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MyFrame extends JFrame {

//	Constructor
	public MyFrame(int w, int h) {
		Border border = BorderFactory.createLineBorder(Color.black, 5);
		
// ---- JLayeredPane ----
		JLabel lb1 = new JLabel();
		lb1.setOpaque(true);
		lb1.setIcon(null);
		lb1.setBackground(new Color(0xa8a8a8));
		lb1.setBounds(50, 50, 200, 200);
		lb1.setBorder(border); // set border of label
		
		JLabel lb2 = new JLabel();
		lb2.setOpaque(true);
		lb2.setBackground(Color.GREEN);
		lb2.setBounds(100, 100, 200, 200);
		lb2.setBorder(border); // set border of label
		
		JLabel lb3 = new JLabel();
		lb3.setOpaque(true);
		lb3.setBackground(Color.BLUE);
		lb3.setBounds(150, 150, 200, 200);
		lb3.setBorder(border); // set border of label
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0, 500, 500);
		
//		layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
//		layeredPane.add(label2, JLayeredPane.MODAL_LAYER);
//		layeredPane.add(label3, JLayeredPane.DRAG_LAYER);
		
		layeredPane.add(lb1, Integer.valueOf(0));
		layeredPane.add(lb2, Integer.valueOf(1));
		layeredPane.add(lb3, Integer.valueOf(2));
		
//		this.add(layeredPane);
		
// ---- JLabel ----
		JLabel label = this.createLabel("Welcome!", true);
		label.setBackground(new Color(0xffffff)); // set background color
		label.setOpaque(true); // display background color
		label.setBorder(border); // set border of label
		label.setBounds(100, 50, 300, 300); // set x,y, position within frame as well as dimensions
		
// ---- JPanel ----
		JLabel rLb = this.createLabel("", true);
		JLabel bLb = this.createLabel("", true);
		JLabel yLb = this.createLabel("", true);
		JPanel redPanel = this.createPanel(0, 0, 250, 250, new Color(255, 0, 0));
		JPanel bluePanel = this.createPanel(250, 0, 250, 250, new Color(0, 0, 250));
		JPanel yellowPanel = this.createPanel(0, 250, 500, 250, new Color(255, 250, 0));
		
		redPanel.add(rLb);
		bluePanel.add(bLb);
		yellowPanel.add(yLb);
		
// ---- New window ----
		JButton btt = this.createButton(10, 10, 200, 40, "Layouts");
		btt.setEnabled(false);
		btt.addActionListener(e -> {
			this.dispose();
			new Layouts(w, h);
		});
		
// ---- JButton ----
		JButton btn = this.createButton(100, 355, 300, 50, "Hide");
		btn.addActionListener(e -> {
			label.setVisible(false);
			btn.setVisible(false);
			btt.setEnabled(true);
		});
		
// ---- JFrame ----
		this.setTitle("GUI"); // sets title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		this.setResizable(false); // prevent frame from being resized
		this.setSize(w, h); // sets the x-dimension and y-dimension of frame
		this.setVisible(true); // make frame visible
		this.setLayout(null); // set layout


//		Add label
		this.add(label);

//		Add button
		this.add(btn);
		this.add(btt);
		
//		Add panel
		this.add(redPanel);
		this.add(bluePanel);
		this.add(yellowPanel);
		
//		this.pack();
		
		ImageIcon img = new ImageIcon("logo.png"); // create an ImageIcon
		this.setIconImage(img.getImage()); // change icon of frame
//		this.getContentPane().setBackground(new Color(0xa8a8a8)); // change color of background
	}
	
	
//	create JLabel
	public JLabel createLabel(String text, Boolean bool) {
		ImageIcon icon = new ImageIcon("logo.png");
		JLabel label = new JLabel();
		
		label.setText(text); // set text of label
		if(bool) label.setIcon(icon); // set icon of label
		label.setIconTextGap(0); // set gap of text to image

//		label.setBackground(new Color(0xffffff)); // set background color
//		label.setOpaque(true); // display background color
//		label.setBorder(border); // set border of label
//		label.setVisible(false); // set visible of label
		
		label.setForeground(new Color(0x000000)); // set font color text
		label.setFont(new Font("Arial", Font.PLAIN, 20)); // set font of text
		
		label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of ImageIcon
		label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of ImageIcon
		
		label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER);  // set horizontal position of icon+text within label
		
		return label;
	}
	
//	Create button
	public JButton createButton(int x, int y, int w, int h, String text) {
		JButton button = new JButton();
		button.setBounds(x, y, w, h);
		button.setText(text);
//		button.setIcon(null);
		button.setFocusable(false);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.CENTER);
		button.setFont(new Font("Arial", Font.BOLD, 20));
		button.setForeground(Color.black);
		button.setIconTextGap(0);
		button.setBackground(getForeground());
		button.setBorder(BorderFactory.createEtchedBorder());
//		button.setEnabled(false);
		
		return button;
	}
	
//	create JPanel
	public JPanel createPanel(int x, int y, int w, int h, Color color) {
		JPanel panel = new JPanel();
		panel.setBackground(color); // set background of panel
		panel.setBounds(x, y, w, h); // set bounds of panel
		panel.setLayout(new BorderLayout()); // set layout of panel
//		panel.setPreferredSize(new Dimension(w, h));
		
		return panel;
	}

}

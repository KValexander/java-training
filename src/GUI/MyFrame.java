package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;

//import java.awt.BorderLayout;
//import java.awt.FlowLayout;
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.Font;
//
//import javax.swing.BorderFactory;
//import javax.swing.ButtonGroup;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JCheckBox;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JLayeredPane;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.JRadioButton;
//import javax.swing.JTextField;
//import javax.swing.border.Border;

public class MyFrame extends JFrame {

//	Constructor
	public MyFrame(int w, int h) {
		Border border = BorderFactory.createLineBorder(Color.black, 5);
		
// ---- JOptionPane ----
		
//		JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null, "This is more some useless info :D", "title", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Really?", "title", JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null, "You're computer has a VIRUS!", "title", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "Call tech support NOW OR ELSE!!!", "title", JOptionPane.ERROR_MESSAGE);

//		int answer = JOptionPane.showConfirmDialog(null, "Do you even code?", "This is my title", JOptionPane.YES_NO_CANCEL_OPTION);
//		String name = JOptionPane.showInputDialog("what is your name?: ");
		
		String[] responses = {"No, you're awesome", "Thank you!", "*blush*"};
		ImageIcon icon = new ImageIcon("bup.png");
		JOptionPane.showOptionDialog(
				null,
				"You are awesome!",
				"Secret message",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				icon,
				responses,
				0);
		
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

// ---- JRadioButton ----
//		this.setLayout(new FlowLayout());
//		this.pack();
		JRadioButton rB1 = this.createRadioButton();
		JRadioButton rB2 = this.createRadioButton();
		JRadioButton rB3 = this.createRadioButton();
		ButtonGroup group = new ButtonGroup();
		group.add(rB1);
		group.add(rB2);
		group.add(rB3);
//		this.add(rB1);
//		this.add(rB2);
//		this.add(rB3);
		
// ---- JFrame ----
		this.setTitle("GUI"); // sets title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		this.setResizable(false); // prevent frame from being resized
		this.setSize(w, h); // sets the x-dimension and y-dimension of frame
		this.setLocationRelativeTo(null); // centering the window
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
	
//	create JPanel
	public JPanel createPanel(int x, int y, int w, int h, Color color) {
		JPanel panel = new JPanel();
		panel.setBackground(color); // set background of panel
		panel.setBounds(x, y, w, h); // set bounds of panel
		panel.setLayout(new BorderLayout()); // set layout of panel
//		panel.setPreferredSize(new Dimension(w, h));
		
		return panel;
	}
	
//	Create JButton
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

//	Create JTextField
	public JTextField createTextField() {
		JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 50));
		textField.setFont(new Font("Arial", Font.PLAIN, 20));
//		textField.setForeground(Color.black);
//		textField.setBackground(Color.white);
//		textField.setCaretColor(Color.white);
//		textField.setText("username");
//		textField.setText(false);
		
		return textField;
	}
	
//	Create JCheckBox
	public JCheckBox createCheckBox() {
		ImageIcon xIcon = new ImageIcon("bup.png");
		ImageIcon checkIcon = new ImageIcon("logo.png");
		
		JCheckBox checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
		checkBox.setIcon(xIcon);
		checkBox.setSelectedIcon(checkIcon);
//		checkBox.isSelected()
		
		return checkBox;
	}
	
//	Create JRadioButton
	public JRadioButton createRadioButton() {
//		ImageIcon icon = new ImageIcon("bup.png");
		JRadioButton radioButton = new JRadioButton();
//		radioButton.setIcon(icon);
		
		return radioButton;
	}
	
//	Create JComboBox
	public JComboBox createComboBox(String[] array) {
//		this.setLayout(new FlowLayout());
//		this.pack();
		
		JComboBox comboBox = new JComboBox(array);
//		comboBox.addActionListener(e -> System.out.println(comboBox.getSelectedItem());
//		comboBox.setEditable(true);
//		System.out.println(comboBox.getItemCount());
//		comboBox.addItem("horse");
//		comboBox.insertItemAt("pig", 0);
//		comboBox.setSelectedIndex(0);
//		comboBox.removeItem("cat");
//		comboBox.removeItemAt(0);
//		comboBox.removeAllItems();
		
		return comboBox;
	}
	
}

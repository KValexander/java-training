package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StartPage implements ActionListener {
	
	JFrame frame = new JFrame("GUI");
	
	public StartPage() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450, 420);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
		
		JButton myFrameButton= this.createButton(10, 10, 200, 40, "MyFrame");
		JButton layoutsButton = this.createButton(10, 60, 200, 40, "Layouts");
		JButton progressBarDemoButton = this.createButton(10, 110, 200, 40, "ProgressBar demo");
		JButton sliderDemoButton = this.createButton(10, 160, 200, 40, "Slider demo");
		JButton menuBarDemoButton = this.createButton(10, 210, 200, 40, "MenuBar demo");
		JButton colorChooserDemoButton = this.createButton(10, 260, 200, 40, "ColorChooser demo");
		JButton keyListenerDemoButton = this.createButton(10, 310, 200, 40, "KeyListener demo");
		JButton mouseListenerDemoButton = this.createButton(220, 10, 200, 40, "MouseListener demo");
		
		myFrameButton.addActionListener(e -> {
			frame.dispose();
			new MyFrame(500, 500);
		});
		layoutsButton.addActionListener(e -> {
			frame.dispose();
			new Layouts(400, 400);
		});
		progressBarDemoButton.setEnabled(false);
		progressBarDemoButton.addActionListener(e -> {
			frame.dispose();
			new ProgressBarDemo();
		});
		sliderDemoButton.addActionListener(e -> {
			frame.dispose();
			new SliderDemo();
		});
		menuBarDemoButton.addActionListener(e -> {
			frame.dispose();
			new MenuBarDemo();
		});
		colorChooserDemoButton.addActionListener(e -> {
			frame.dispose();
			new ColorChooserDemo();
		});
		keyListenerDemoButton.addActionListener(e -> {
			frame.dispose();
			new KeyListenerDemo();
		});
		mouseListenerDemoButton.addActionListener(e -> {
			frame.dispose();
			new MouseListenerDemo();
		});
		
		frame.add(myFrameButton);
		frame.add(layoutsButton);
		frame.add(progressBarDemoButton);
		frame.add(sliderDemoButton);
		frame.add(menuBarDemoButton);
		frame.add(colorChooserDemoButton);
		frame.add(keyListenerDemoButton);
		frame.add(mouseListenerDemoButton);
		
	}
	
	private JButton createButton(int x, int y, int w, int h, String text) {
		JButton button = new JButton();
		button.setBounds(x, y, w, h);
		button.setText(text);
		button.setFocusable(false);
		
		return button;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		frame.dispose();
		
	}

}

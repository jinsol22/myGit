package homework;



import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyEventColor extends JFrame {
	private JButton button1, button2, button3, button4, button5;
	public MyEventColor() {
		//setLayout(new FlowLayout());
		button1 = new JButton("Red");
		button2 = new JButton("Blue");
		button3 = new JButton("Green");
		button4 = new JButton("Yellow");
		button5 = new JButton(); 
		
		
		button1.addActionListener(new MyColorAction(this, Color.red));
		button2.addActionListener(new MyColorAction(this, Color.blue));
		button3.addActionListener(new MyColorAction(this, Color.green));
		button4.addActionListener(new MyColorAction(this, Color.yellow));
		
		add(button1, "North");
		add(button2, "South");
		add(button3, "West");
		add(button4, "East");

		setSize(450, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//현재 창만 닫음
	}
	public static void main(String[] args) {
		new MyEventColor();
	}

}

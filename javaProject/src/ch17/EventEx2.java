package ch17;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import homework.MyColorAction;

public class EventEx2 extends JFrame {
	private JButton button1, button2,button3,button4,button5,button6;
	public EventEx2( ) {
		setLayout(new FlowLayout());
		button1 = new JButton("Red");
		button1 = new JButton("Green");
		button1 = new JButton("Blue");
		button1 = new JButton("Whie");
		button1 = new JButton("Yellow");
		button1 = new JButton("Cyan");
		
		//프레임버튼추가
		add(button1); add(button2);add(button3);
		add(button4);add(button5);add(button6);
		
		//버튼 클릭시 이벤트 추가
		button1.addActionListener(new MyColorAction(this, Color.red));
		button2.addActionListener(new MyColorAction(this, Color.green));
		button3.addActionListener(new MyColorAction(this, Color.blue));
		button4.addActionListener(new MyColorAction(this, Color.white));
		button5.addActionListener(new MyColorAction(this, Color.yellow));
		button6.addActionListener(new MyColorAction(this, Color.cyan));
		
		setSize(450,300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//현재 창만 닫기
	}
	public static void main(String[] args) {
		new EventEx2();
	}
}

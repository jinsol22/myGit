package ch17;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Pizza extends JFrame  {
	public Pizza() {
		super("피자 메뉴");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel.setBackground(Color.BLUE);
		panel1.setBackground(Color.CYAN);
		panel2.setBackground(Color.GREEN);
		
		JLabel label = new JLabel("피자 종류를 선택하세요");
		panel1.add(label);
		
		JButton button1 = new JButton("치즈");
		JButton button2 = new JButton("불고기");
		JButton button3 = new JButton("ㅍㅌㅇㅌ");
		JButton button4 = new JButton("종료");
		
		//panel2에 버튼 추가
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		
		//panel에 다른 패널 추가
		panel.add(panel1);
		panel.add(panel2);
		
		add(panel,"North");
		setVisible(true);
		
		ActionListener handler=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("치즈")) {
					JOptionPane.showMessageDialog(null, "치즈피자를 선책하셨습니다. \n가격 : 23,000", "치즈피자", 
							JOptionPane.INFORMATION_MESSAGE);;
				
				}else if(e.getActionCommand().equals("불고기")) {
					JOptionPane.showMessageDialog(null, "불고기피자를 선책하셨습니다. \n가격 : 23,000", "치즈피자", 
							JOptionPane.INFORMATION_MESSAGE);;
				}else if(e.getActionCommand().equals("포테이토")) {
					JOptionPane.showMessageDialog(null, "포테이토를 선책하셨습니다. \n가격 : 23,000", "치즈피자", 
							JOptionPane.INFORMATION_MESSAGE);;
				
				}else if (e.getActionCommand().equals("종료")) {
					JOptionPane.showMessageDialog(null, "프로그램을 종료 하시갰습니까?" , "종료", JOptionPane.OK_CANCEL_OPTION);
					System.exit(0);
				}
						
				
			}
		};
		
		button1.addActionListener(handler);
		button2.addActionListener(handler);
		button3.addActionListener(handler);
		button4.addActionListener(handler);
	}
	public static void main(String[] args) {
		new Pizza();
	}

}

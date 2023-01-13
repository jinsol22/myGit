package ch17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//이벤트 처리 3대요서 : 1.이벤트 소스, 2.이벤트 처리기(클래스), 2.이벤트 리스너
public class EvnetEx extends Frame implements WindowListener {
	public EvnetEx() {
		addWindowListener(this);//(new....)해서 쓰지 않고 WindowListener를 상속받아 쓰면(this)
		//사용가능
		setSize(300,300);
		setVisible(true);
	}
	 public static void main(String[] args) {
		 new EvnetEx();
	}
	@Override
	public void windowOpened(WindowEvent e) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}

}

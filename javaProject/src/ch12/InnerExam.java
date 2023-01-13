package ch12;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class InnerExam extends Frame {
	 public InnerExam() {
		 super("내부 클래스 테스트");
		 setSize(300,400);//프레임크기인 가로 ,세로 초기 사이즈 설정
		 setVisible(true);
	 }
	 public static void main(String[] args) {
//	
//	 InnerExam e=new InnerExam();
//	 e.addWindowListener(new WindowListener() {
//		
//		@Override
//		public void windowOpened(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public void windowIconified(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public void windowDeiconified(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public void windowDeactivated(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public void windowClosing(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public void windowClosed(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		@Override
//		public void windowActivated(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//	 });
		 
		 e.addWindowLIstener( new WindowAdapter() {
			 
		}; 
			 
		 }
	 }
}
	 
		 
	 
	 


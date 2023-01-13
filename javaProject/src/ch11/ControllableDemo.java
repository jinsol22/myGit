package ch11;
import ch11.Controllable;

public class ControllableDemo {
	public static void main(String[] args) {
		Tv tv= new Tv();
		tv.turnOn();
		tv.turnOff();
		tv.remoteOn();
		tv.remoteOff();
		tv.repair();
		
		Controllable.reset();//static 메소드는 클래스이름.메소드로 접근가능하다.
		
		Computer com=new Computer();
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable.reset();
	}
}

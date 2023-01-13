package homework;

public interface Controllable {
	default void repair() {//인터페이스에서 명시적 default메소드로의 구현은 jdk8부터 가능
		System.out.println("장비를 수리한다.");
	}
	static void reset() {//인터페이스에서 static 메소드로의 구현도 jdk8부터 가능
		System.out.println("장비를 초기화 한다.");

}
	void turnOn();
	void turnOff(); 
}

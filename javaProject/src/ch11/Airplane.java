package ch11;

public class Airplane implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Airplane 이륙");
		// TODO Auto-generated method stub

	}

	@Override
	public void fly() {
		System.out.println("Airplane 비행");
		// TODO Auto-generated method stub

	}

	@Override
	public void land() {
		System.out.println("Airplane 착륙");
		// TODO Auto-generated method stub

	}

}

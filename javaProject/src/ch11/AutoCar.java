package ch11;

public class AutoCar implements OperateCar {

	@Override
	public void start() {
		System.out.println("자동차가 출발합니다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		System.out.println("자동차가 정지합니다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void setSpeed(int speed) {
		System.out.println("자동차가 속도를"+speed+"km/h롤 바꿉니다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void turn(int degree) {
		// TODO Auto-generated method stub
		System.out.println("자동차가 뱡향을"+degree+"도 만큼 바꿉니다.");

	}

}

package homework;

public class VehicleUse {
	public static void main(String[] args) {
		
		//좌변 부모 우변 자식
		Vehicle ve=new Car();//다형성
		ve.speedUp();
		ve.speedDown();
		ve.handling();
		ve=new Plane();
		ve.speedUp();
		ve.speedDown();
		ve.handling();
		ve=new Boat();
		ve.speedUp();
		ve.speedDown();
		ve.handling();
		
	}

}

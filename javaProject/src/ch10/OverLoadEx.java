package ch10;

public class OverLoadEx {
	public void putData(String a) {
		System.out.println(a);
	}
	public void putData(int a) {
		System.out.println(a);
	}
	public void putData(double a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		OverLoadEx o=new OverLoadEx();
		o.putData("Hello");
		o.putData(10);
		o.putData(10.5);
		
	}
}

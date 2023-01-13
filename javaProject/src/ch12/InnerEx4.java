package ch12;

class Outer{
	class InstanceInner{
		int a=100;//non-static은 반드시 생성후 참조변수.멤버면수
	}//inner class
	static class StaticInner{
		int a=200;
		static int b=100;
	}//static inner class
	void myMethod() {
		class LocalInner{//메소드 안 이너클래스
			int a=400;
		}
		LocalInner i=new LocalInner();
		System.out.println("i.a :" + i.a);
	}//메소드
}



public class InnerEx4 {
	public static void main(String[] args) {
		Outer oc = new Outer();//바깥쪽 클래스
		Outer.InstanceInner i=oc.new InstanceInner();//객체 생성
		
		System.out.println("i.a : "+i.a);
		System.out.println("Outer.StaticInner.b : "+Outer.StaticInner.b);
		
		Outer.StaticInner si = new Outer.StaticInner();//non-static멤버도 접근 가능
		System.out.println("si.a : "+si.a);
		
		oc.myMethod();
		
		
	}
}

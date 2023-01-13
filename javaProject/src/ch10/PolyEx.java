package ch10;

public class PolyEx {
	public static void main(String[] args) {
		int a=10;
		double b=20.1;
		char c='A';
		String d="hello";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//object 는 최상위 클래스(조상클래스) ,모든 타입을 다 다룰 수 있다.
		//object를 그대로 사용하면 프로그램이 무거워지며 속도 저하
		//한개의 자료형으로 다양한 형태의 자료형을 처리 가능하다. 이게 다형성 이다.
	
		
		Object o="Java";
		System.out.println(o);
	}
}
